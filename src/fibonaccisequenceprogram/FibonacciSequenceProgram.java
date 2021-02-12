
package fibonaccisequenceprogram;
import java.util.Scanner;

public class FibonacciSequenceProgram {

    
    public static void main(String[] args) {
        // variables
        Scanner probe = new Scanner(System.in);
        int first = 0;
        int second = 1;
        int total = 0;
        int number;
        
        //program start
        System.out.println("How many numbers in the Fibonacci Sequence would you like to see?");
        number = probe.nextInt();
        System.out.println("");
        System.out.println("Here is the Fibonacci Sequence...");
        for (int i=number; i > 0; i--){
            
            System.out.println(total);//display sequence
            total = first+second;
            first = second;
            second = total;
        }
        
    }
    
}
