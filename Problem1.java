import java.util.Scanner;

public class Problem1 {
    public static String switchRoman(int num) {
        if (num < 1 || num > 3999) {
            throw new IllegalArgumentException("Input must be between 1 and 3999");
        }

        StringBuilder result = new StringBuilder();
        int[] numericalValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < numericalValues.length; i++) {
            while (num >= numericalValues[i]) {
                num -= numericalValues[i];
                result.append(romanSymbols[i]);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 3999: ");
        int number = scanner.nextInt();

        try {
            String symbol = switchRoman(number);
            System.out.println("Roman Numeral: " + symbol);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
       
            scanner.close();
        }
    }
}
