import java.util.Scanner;

public class activityEight {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Enter grade (1-100): ");
        int grade = inp.nextInt();
        
        if (grade < 1 || grade > 100) {
            System.out.println("Invalid input. Please enter 1-100 only.");
        } 
        else if (grade >= 91) {
            System.out.println("Equivalent Grade: A+");
            System.out.println("Remarks: Excellent");
        } 
        else if (grade >= 81) {
            System.out.println("Equivalent Grade: A");
            System.out.println("Remarks: Very Good");
        } 
        else if (grade >= 75) {
            System.out.println("Equivalent Grade: B+");
            System.out.println("Remarks: Good");
        } 
        else if (grade == 74) {
            System.out.println("Equivalent Grade: B");
            System.out.println("Remarks: Poor");
        } 
        else {
            System.out.println("Equivalent Grade: C");
            System.out.println("Remarks: Very Poor");
        }
        
        inp.close();
    }
}

