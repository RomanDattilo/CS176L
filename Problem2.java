import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem2 {

    public static void main(String[] args) {
        try {
            checkForDuplicates(getNumbersFromUser());
            System.out.println("No duplicates found.");
        } catch (DuplicateNumberException e) {
            System.err.println("Duplicate number found: " + e.getNumber());
        }
    }

    static Set<Integer> getNumbersFromUser() {
        try (Scanner scanner = new Scanner(System.in)) {
			Set<Integer> numbers = new HashSet<>();

			System.out.print("Enter the number of integers: ");
			int count = scanner.nextInt();

			System.out.println("Enter the integers:");
			for (int i = 0; i < count; i++) {
			    int number = scanner.nextInt();
			    numbers.add(number);
			}

			return numbers;
		}
    }

    static void checkForDuplicates(Set<Integer> numbers) throws DuplicateNumberException {
        Set<Integer> seenNumbers = new HashSet<>();
        for (int number : numbers) {
            if (!seenNumbers.add(number)) {
                throw new DuplicateNumberException(number);
            }
        }
    }
}


   
    

