import java.util.Scanner;
public class activitySeventeen {
    public static void main(String[] args) {
        // initialization
        Scanner inp = new Scanner(System.in);
        int startingNumberRange;
        int endingNumberRange;
        int i;
        int sum = 0;

        // input
        System.out.print("Enter the starting number of the range: ");
        startingNumberRange = inp.nextInt();
        System.out.print("Enter the ending number of the range: ");
        endingNumberRange = inp.nextInt();


        for(i = startingNumberRange; i <= endingNumberRange; i++) {
            if(i % 2 == 0) {
                // process
                sum += i;
            }
        }
        // output
        System.out.println("The sum of even numbers between " + startingNumberRange + " and " + endingNumberRange + " is: "+ sum);

        // scanner close
        inp.close();
    }
}
