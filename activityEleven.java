import java.util.Scanner;
public class activityEleven {
    public static void main(String[] args) {
        // initialization
        Scanner inp = new Scanner(System.in);
        int sides;
        //input
        System.out.print("Enter number of sides of geometric shape (3-10): ");
        sides = inp.nextInt();

        if (sides < 3 || sides > 10) {
            System.out.println("Error: Invalid number of sides. Please enter 3 to 10 only.");
        } else {

            switch (sides) {
                case 3:
                    System.out.println("Triangle");
                    break;
                case 4:
                    System.out.println("Quadrilateral");
                    break;
                case 5:
                    System.out.println("Pentagon");
                    break;
                case 6:
                    System.out.println("Hexagon");
                    break;
                case 7:
                    System.out.println("Heptagon");
                    break;
                case 8:
                    System.out.println("Octagon");
                    break;
                case 9:
                    System.out.println("Nonagon");
                    break;
                case 10:
                    System.out.println("Decagon");
                    break;
            }
        }
        // scanner close
        inp.close();
    }
}
