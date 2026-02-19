public class activityTwenty {
    public static void main(String[] args) {
        // initialization
        int[] arr = {1, 2, 2, 2, 3, 3, 3, 4, 5};
        boolean isDuplicate = false;

        for (int i = 0; i < arr.length; i++) {
            isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                // output
                System.out.print(arr[i] + " ");
            }
        }
    }
}

// problem
// create a java program to remove all occurrences of an element in an array.