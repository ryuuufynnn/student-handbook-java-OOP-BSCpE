public class activityFour {
    public static void main(String[] args) {
        // declaration
        double adjacent = 750;
        double angle = 41;
        // process
        double radians = Math.toRadians(angle);
        // compute the hypotenuse
        double hypotenuse = adjacent / Math.cos(radians);
        // output
        System.out.printf("The distance between the rocket and the observer is: %.2f yards.", hypotenuse);
    }
}

// an observer stands 750 yards from the launch pad of a model rocket. As the rises,
// the observer measures its angle of elevation at a given moment to be 41 degerees.
// at the moment, how far apart are the rocket and the observer?