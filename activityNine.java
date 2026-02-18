import java.util.Scanner;

public class activityNine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int speed;
        // input
        System.out.print("Enter automobile speed (mph): ");
        speed = input.nextInt();

        if (speed <= 54) {
            System.out.println("Not Speeding.");
        } 
        else if (speed <= 60) {
            System.out.println("Speeding...");
            System.out.println("Penalty Fee: P 200.00");
        } 
        else if (speed <= 70) {
            System.out.println("Speeding...");
            System.out.println("Penalty Fee: P 250.00");
        } 
        else if (speed <= 80) {
            System.out.println("Speeding...");
            System.out.println("Penalty Fee: P 300.00");
        } 
        else {
            System.out.println("Speed exceeds penalty table range.");
        }
        // scanner close
        input.close();
    }
}
