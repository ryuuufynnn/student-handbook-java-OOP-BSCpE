import java.util.Scanner;
public class activityTwentyTwo {
    public static void main(String[] args) {
        // initialization
        Scanner input = new Scanner(System.in);
        double a;
        double b;
        double c;
        double discriminant;
        double rootOne;
        double rootTwo;
        // outputOne
        System.out.println("Enter the values");
        // input
        System.out.print("A: ");
        a = input.nextDouble();
        System.out.print("B: ");
        b = input.nextDouble();
        System.out.print("C: ");
        c = input.nextDouble();
        // outputTwo
        System.out.println("\nGiven quadratic equation: "
                + a + "x^2 + " + b + "x + " + c);

        // quadratic checking
        if (a == 0) {
            System.out.println("Not a quadratic equation.");
        } else {

            discriminant = (b * b) - (4 * a * c);

            if (discriminant > 0) {

                rootOne = (-b + Math.sqrt(discriminant)) / (2 * a);
                rootTwo = (-b - Math.sqrt(discriminant)) / (2 * a);

                System.out.println("Roots are real and different");
                System.out.println("Root One: " + rootOne);
                System.out.println("Root Two: " + rootTwo);

            } else if (discriminant == 0) {

                rootOne = -b / (2 * a);

                System.out.println("Roots are real and equal");
                System.out.println("Root: " + rootOne);

            } else {

                System.out.println("Roots are imaginary");

            }
        }
        // scanner close
        input.close();
    }
}
