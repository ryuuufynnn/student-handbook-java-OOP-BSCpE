import java.util.Scanner;
public class activityTwelve {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int date;
        int year;
        int month;
        String monthName = "";

        // input
        System.out.print("Enter the month (1-12): ");
        month = inp.nextInt();
        System.out.print("Enter the date: ");
        date = inp.nextInt();
        System.out.print("Enter the year: ");
        year = inp.nextInt();

        // output
        System.out.println("\nMonth: " + month);
        System.out.println("Date: " + date);
        System.out.println("Year: " + year);

        switch(month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
        }

        System.out.println("\n" + monthName + " "+ date + ", " + year);

        inp.close();
    }
}
