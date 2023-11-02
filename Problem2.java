import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int firstIndex = -1;
        int firstRepeatingNumber = -1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    if (firstIndex == -1 || j < firstIndex) {
                        firstIndex = j;
                        firstRepeatingNumber = arr[j];
                    }
                }
            }
        }

        if (firstRepeatingNumber != -1) {
            System.out.println("First repeating element is " + firstRepeatingNumber);
        } else {
            System.out.println("No repeating numbers found.");
        }

        scanner.close();
    }
}
