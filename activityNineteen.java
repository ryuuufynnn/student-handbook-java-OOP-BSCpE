import java.util.Scanner;
public class activityNineteen {
    public static void main(String[] args) {
        // initialization
        Scanner inp = new Scanner(System.in);
        int rows;
        int i;
        int j;

        // input
        System.out.print("Enter the number of rows (N): ");
        rows = inp.nextInt();

        // pascal triangle
        for (i = 0; i <= rows; i++) {

            int number = 1;

            // spacing
            if (rows - i > 0) {
                // output
                System.out.printf("%" + (rows - i) * 2 + "s", "");
            }

            // numbers
            for (j = 0; j <= i; j++) {
                // output
                System.out.printf("%4d", number); 
                number = number * (i - j) / (j + 1);
            }
            
            // output
            System.out.println();
        }

        // scanner close
        inp.close();
    }
}

// problem
// create a flowchart and a java program that displays the pascal's triangle.