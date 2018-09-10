
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
        
    
}
