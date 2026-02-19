import java.util.Scanner;
public class activityTwentyFive {
    public static void main(String[] args) {
        // initialization
        Scanner input = new Scanner(System.in);
        int decimal = 0;
        int power = 0;
        String binary;
        // input
        System.out.print("Input a binary number: ");
        binary = input.nextLine();

        

        for (int i = binary.length() - 1; i >= 0; i--) {
            char digit = binary.charAt(i);

            if (digit == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        // output
        System.out.println("Decimal number: " + decimal);

        // scanner close
        input.close();
    }
}
// create a java program to convert a vinary number to a decimal number