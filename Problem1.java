import java.util.Scanner;


public class Problem1 {
	


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter word: ");
	        String userInput = scanner.nextLine();

	        if (isPalindrome(userInput)) {
	            System.out.println("This word is a Palindrome.");
	        } else {
	            System.out.println("This word isnt a Palindrome.");
	        }

	        scanner.close();
	    }

	    public static boolean isPalindrome(String word) {
	     
	        word = word.replaceAll(" ", "").toLowerCase();

	        
	        String reversed = new StringBuilder(word).reverse().toString();
	        return word.equals(reversed);
	    }
	{}

}


