import java.util.Scanner;
public class activityFourteen {
    public static void main(String[] args) {
        // initialization
        Scanner inp = new Scanner(System.in);
        int number;
        int sum = 0;
        int i = 1;

        // input
        System.out.print("Enter a number (n): ");
        number = inp.nextInt();

        while(i <= number) {
            if(i % 2 == 0) {
                sum += i;
            }
            i++;
        }

        // output
        System.out.println("The sum of all even numbers from 1 to " + number + " is: " + sum);
        // scanner close
        inp.close();
    }
}
