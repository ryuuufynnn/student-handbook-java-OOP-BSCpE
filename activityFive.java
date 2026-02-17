import java.util.Scanner;
public class activityFive {
    public static void main(String[] args) {
        // preparation
        Scanner inp = new Scanner(System.in);
        double angleOne;
        double angleTwo;
        double adjacent;
        double oppositeOne;
        double oppositeTwo;
        double heightSmokestack;
        double radiansOne;
        double radiansTwo;
        
        // input
        System.out.print("input AngleOne: ");
        angleOne = inp.nextDouble();
        System.out.print("Input Adjacent: ");
        adjacent = inp.nextDouble();
        System.out.print("Input AngleTwo: ");
        angleTwo = inp.nextDouble();

        // process
        // convert to radians
        radiansOne = Math.toRadians(angleOne);
        radiansTwo = Math.toRadians(angleTwo);
        // compute the opposite sides
        oppositeOne = adjacent * Math.tan(radiansOne);
        oppositeTwo = adjacent * Math.tan(radiansTwo);
        // height of the smokestack
        heightSmokestack = oppositeTwo - oppositeOne;

        // output
        System.out.println("OppositeOne: " + oppositeOne);
        System.out.println("OppositeTwo: " + oppositeTwo);
        System.out.println("Height of the smokestack: " + heightSmokestack);
        // scanner close
        inp.close();
    }
}
