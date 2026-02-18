import java.util.Scanner;
public class activityThirteen {
    public static void main(String[] args) {
        // initialization
        Scanner inp = new Scanner(System.in);
        int number;

        // input
        System.out.print("Enter a number: ");
        number = inp.nextInt();
        int count = 0;
        int temp = number;

        if(number < 0) {
            System.out.println("No negative input. Please enter a positive integer only.");
            return;
        }
        while(temp > 0) {
            count++;
            temp /= 10;
        }
        System.out.println("Total digit is: " + count);
        // scanner close
        inp.close();
    }
}
// problem
/* create a flowchart and a java program that counts the number of digits in a given integer. The user will input a positive integer, and the program should output the total number of digits in the number. */