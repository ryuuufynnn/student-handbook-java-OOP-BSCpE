import java.util.Scanner;
public class activityTwo {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double numOne;
        double numTwo;
        double product;

        System.out.print("Enter numOne: ");
        numOne = inp.nextDouble();
        System.out.print("Enter numTwo: ");
        numTwo = inp.nextDouble();

        product = numOne * numTwo;

        System.out.println("String you entered is: " + product);

        inp.close();
    }
}

// problem
// create a flow chart and java porgram that accepts two-input integer and displays the product.