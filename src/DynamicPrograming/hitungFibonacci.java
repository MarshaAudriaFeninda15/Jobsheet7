
package DynamicPrograming;
import java.util.Scanner;
import java.math.BigInteger;
public class hitungFibonacci {
    
    private static void tampilJudul(String identitas){
        System.out.println("Identitas : " + identitas);
        
        System.out.println("\nHitung Fibonacci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21, ... dst.\n");
    }
    private static int tampilInput() {
            Scanner marsa = new Scanner(System.in);
            
            System.out.print("Bilangan ke-");
           
            int n = marsa.nextInt();
            return n;
        }
     private static BigInteger fibo(int n) {
            
            BigInteger[] spongebob = new BigInteger[n];
            
            spongebob[0] = BigInteger.ONE;
            spongebob[1] = BigInteger.ONE;
            
            for (int i = 2; i < spongebob.length; i++) {
                spongebob[i] = spongebob[i-1].add(spongebob[i-1]);
            }
            
            return spongebob[n-1];
                
            }
        
        
    
}
