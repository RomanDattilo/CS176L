

import java.util.Arrays;
import java.util.Scanner;

public class Problem3 {
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String inputBlah = scanner.nextLine();
	        scanner.close();

	        String outputBlah = rearrangeString(inputBlah);
	        System.out.println(outputBlah);
	    }

	    public static String rearrangeString(String inputStr) {
	        
	        StringBuilder alphabet = new StringBuilder();
	        StringBuilder digit = new StringBuilder();

	        for (char c : inputStr.toCharArray()) {
	            if (Character.isLetter(c)) {
	                alphabet.append(c);
	            } else if (Character.isDigit(c)) {
	                digit.append(c);
	            }
	        }

	        
	        char[] sortedAlphabets = alphabet.toString().toCharArray();
	        Arrays.sort(sortedAlphabets);

	        
	        int sumOfDigits = 0;
	        for (char digits : digit.toString().toCharArray()) {
	            sumOfDigits += Character.getNumericValue(digits);
	        }

	        
	        StringBuilder result = new StringBuilder();
	        result.append(sortedAlphabets);
	        result.append(sumOfDigits);

	        return result.toString();
	    }
	}


