import java.util.Scanner;
public class activityTwentyThree {
    public static void main(String[] args) {
        // initialization
        Scanner inp = new Scanner(System.in);
        int elements;
        int elementEnter = 0;
        int product = 1;

        // inputOne
        System.out.print("How many elements you want to multiply: ");
        elements = inp.nextInt();

        for (int i = 1; i <= elements; i++) {
            // inputTwo
            System.out.print("Enter " + i + " Element: ");
            elementEnter = inp.nextInt();

            int temp = 0;

            for (int j = 0; j < elementEnter; j++) {
                temp += product;
            }

            product = temp;
        }
        // output
        System.out.println("\nMultiplication of " + elementEnter + " Numbers: " + product);

        // scanner close
        inp.close();
    }
}
