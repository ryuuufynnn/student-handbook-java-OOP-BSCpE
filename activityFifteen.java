import java.util.Scanner;
public class activityFifteen {
    public static void main(String[] args) {
        // initialization
        Scanner inp = new Scanner(System.in);
        int number;
        int fibonnacciSequence =  0;
        int second = 1;
        int first = 0;
        int next;

        // input
        System.out.print("Enter the number of terms for the fibonacci sequence: ");
        number = inp.nextInt();

        // output
        System.out.println("Fibonacci Sequence: ");
        while (fibonnacciSequence < number) {
            System.out.print(first + " ");

            next = first + second;
            first = second;
            second = next;
            fibonnacciSequence++;
        }
        
        // scanner close
        inp.close();
    }
}
