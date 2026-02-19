import java.util.Scanner;

public class activityTwentyOne {
    public static void main(String[] args) {
        // initialization
        Scanner inp = new Scanner(System.in);
        int[] arr = {1, 2, 1, 3, 5};

        // original array
        System.out.print("Original array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // input
        System.out.print("Enter element to remove: ");
        int key = inp.nextInt();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != key) {
                count++;
            }
        }

        // new array
        int[] newArr = new int[count];

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != key) {
                newArr[index] = arr[i];
                index++;
            }
        }

        // output
        System.out.print("Array after removing " + key + ": [");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]);
            if (i < newArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        // scanner close
        inp.close();
    }
}
