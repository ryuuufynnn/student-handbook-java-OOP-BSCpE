import java.util.Scanner;
public class activityTen {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int startTime;
        // input
        System.out.print("Enter call start time (24-hour format, e.g. 1830): ");
        startTime = inp.nextInt();
        System.out.print("Enter call duration in minutes: ");
        int minutes = inp.nextInt();

        double ratePerMinute = 0.40;
        double cost = minutes * ratePerMinute;

        // 50% discount (6PM to before 8AM)
        if (startTime >= 1800 || startTime < 800) {
            cost = cost * 0.50;
        }

        // 15% discount for calls longer than 60 mins
        if (minutes > 60) {
            cost = cost * 0.85;
        }

        // 4% tax
        double tax = cost * 0.04;
        double totalCost = cost + tax;

        System.out.printf("Total Call Cost: P %.2f\n", totalCost);
        // scanner close
        inp.close();
    }
}
