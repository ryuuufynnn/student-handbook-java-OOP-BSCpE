import java.util.Scanner;
public class activityEighteen {
    public static void main(String[] args) {
        // initialization
        Scanner inp = new Scanner(System.in);
        int number;
        int factorial = 1;

        // input
        System.out.print("Enter a number: ");
        number = inp.nextInt();

        for(int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // output
        System.out.println("Factorial of " + number + " is: " + factorial);

        // scanner close
        inp.close();
    }
}

//  problem
// create a flow chart and java program that accepts input to find the factorial of a number.