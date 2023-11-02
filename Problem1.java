import java.util.Scanner;

public class Problem1 {

    public static void reverse(int[] ia) {
        int i = 0, j = ia.length - 1;

        while (i < j) {
            int t = ia[i];
            ia[i] = ia[j];
            ia[j] = t;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] ia = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            ia[i] = scanner.nextInt();
        }

        System.out.println("Original array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(ia[i] + " ");
        }

        reverse(ia);

        System.out.println("Reversed array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(ia[i] + " ");
        }

        scanner.close();
    }
}
