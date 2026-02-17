import java.util.Scanner;
public class activitySeven {
    public static void main(String[] args) {
        // preparation
        Scanner inp = new Scanner(System.in);
        int numberSides;
        double sideLength;
        double area;
        
        // input
        System.out.print("Number of sides: ");
        numberSides = inp.nextInt();
        System.out.print("Length of each side: ");
        sideLength = inp.nextDouble();

        // process
        area = (numberSides * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / numberSides));

        // output
        System.out.println("Area of the polygon: " + area);

        // scanner close
        inp.close();
    }
}
