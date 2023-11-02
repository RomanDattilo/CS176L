import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] ia = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            ia[i] = scanner.nextInt();
        }

        int firstNonRepeatingNumber = findFirstNonRepeatingNumber(ia);

        if (firstNonRepeatingNumber != -1) {
            System.out.println("First non-repeating number is: " + firstNonRepeatingNumber);
        } else {
            System.out.println("No non-repeating number found.");
        }

        scanner.close();
    }

    public static int findFirstNonRepeatingNumber(int[] ia) {
        for (int i = 0; i < ia.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < ia.length; j++) {
                if (i != j && ia[i] == ia[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                return ia[i];
            }
        }

        return -1;
    }
}

