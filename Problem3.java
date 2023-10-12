import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			boolean hasNumbers = true;
			
			while (hasNumbers) {
			    System.out.print("Give a sentence: ");
			    String userInput = scanner.nextLine();
			    hasNumbers = false;

			    for (int i = 0; i < userInput.length(); i++) {
			        char currentChar = userInput.charAt(i);
			        if (currentChar >= '0' && currentChar <= '9') {
			            hasNumbers = true;
			            System.out.println(userInput + " contains numerical characters, fix it.");
			            break;
			        }
			        
			    }

			    if (!hasNumbers) {
			        System.out.println("There aren't any numerical characters. Good job.");
		}
    }
        }}}
