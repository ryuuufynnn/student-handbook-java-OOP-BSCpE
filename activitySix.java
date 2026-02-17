public class activitySix {
    public static void main(String[] args) {
        // preparation
        double c = 112.90;
        double a = 31.10;
        double b = 347.6;
        double angleB;
        double sideA = 0.0;

        //process
        angleB = 180 - a - c;
        sideA = (b * Math.sin(Math.toRadians(a)) / Math.sin(Math.toRadians(angleB)));
        
        // output
        System.out.println("Value of Angle B: " + angleB);
        System.out.println("Value of side A: " + sideA);
    }
}

//problem
// create a flowchart and write a java program to find the solution to the porblem
// a surveyor wishes to measure the distance across a river. she determines
// that c = 112.90, a = 31.10 and b = 347.6.. find the distance a.
