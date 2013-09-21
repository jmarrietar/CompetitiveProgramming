/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.io.*;

/**
 *
 * @author EQUIPO JOSE
 */
public class Palindrome {
    
    public static boolean isPerfectSquare3(long target)
{
    // handle 0 and 1
    if (target <= 1)
        return true;

    long currentSquare = 4;
    long currentNumber = 2;

    // loop through till the target is more than
    // the square of the current number
    while (currentSquare <= target)
    {
        // if we have a match, return true
        if (currentSquare == target)
            return true;
        // increment current number
        currentNumber++;
        // find the next square
        currentSquare = currentNumber * currentNumber;
    }

    // no matching number could be squared
    return false;
}
    
    
    public static boolean isPerfectSquare2(long target){
        
        
       return Math.sqrt((double)target) % 1d == 0d;
    }

    public static boolean isPerfectSquare(long n) {

        if (Math.round(Math.sqrt(n)) == Math.sqrt(n)) {

            return true;
        }
        return false;
    }

    public static boolean ispalindrome(StringBuffer sb) {

        String numero = sb.toString();
        String reverse = sb.reverse().toString();
        if (numero.equals(reverse)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {

      BufferedReader br = new BufferedReader(new FileReader("C-large-1.in"));
      //  BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
      
       File file = new File("/users/EQUIPO JOSE/Documents/NetBeansProjects/Palindrome/filename.txt");
        
        if (!file.exists()) {
				file.createNewFile();
			}
 
	FileWriter fw = new FileWriter(file.getAbsoluteFile());
	BufferedWriter bw = new BufferedWriter(fw);
                        
        
        int N = Integer.parseInt(br.readLine());
        int t=1;
        while (N-->0){
        String [] Intervalos = br.readLine().split("[ ]+");
        Long inicio = Long.parseLong(Intervalos[0]);        
        Long fin= Long.parseLong(Intervalos[1]);
        
        int count = 0;
        for (long i = inicio; i <= fin; i++) {

            StringBuffer sb = new StringBuffer(String.valueOf(i));
            StringBuffer sb2 = new StringBuffer(String.valueOf(((long)Math.sqrt(i))));
           
            Long n = i;
            
            if (ispalindrome(sb) && isPerfectSquare2(n)&& ispalindrome(sb2)) {
                
               
                count++;
            }

        }
   
     // System.out.println(count);
       bw.write("Case #" + t+ ": "+ count);
	bw.newLine();	
             t++;
    }
  bw.close();
    }
    
    
}
