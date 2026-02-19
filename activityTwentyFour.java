import java.util.Scanner;
public class activityTwentyFour {
    public static void main(String[] args) {
        // initialization
        Scanner input = new Scanner(System.in);
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] result = new int[3][3];

        // inputOne
        System.out.println("Enter elements of first 3x3 matrix:");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print("a[" + i + "][" + j + "] = ");
                a[i][j] = input.nextInt();
            }
        }

        // inputTwo
        System.out.println("\nEnter elements of second 3x3 matrix:");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print("b[" + i + "][" + j + "] = ");
                b[i][j] = input.nextInt();
            }
        }

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        // output
        System.out.println("\nResultant Matrix after Addition:");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        // scanner close
        input.close();
    }
}
