
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print(" what is your name?: ");
			String name = scanner.nextLine();
			System.out.println("hello " + name + ", how many exams have you taken?");

			int examAmount = 0;
			while (examAmount <= 0) {
			    System.out.print("Answer: ");
			    examAmount = scanner.nextInt();
			    if (examAmount <= 0) {
			        System.out.println("Please enter a valid number of exams.");
			    }
			}

			int totalScore = 0;

			for (int i = 1; i <= examAmount; i++) {
			    int score;
			    do {
			        System.out.print("Please enter the score of exam " + i + " : ");
			        score = scanner.nextInt();
			        if (score < 0 || score > 100) {
			            System.out.println("Invalid score! Please give me the score of exam " + i );
			        }
			    } while (score < 0 || score > 100);

			    totalScore += score;
			}

			double average = totalScore / examAmount;

			System.out.println("Hi, " + name + ", your average score of " + examAmount + " exams is " + average);
		}
    }
}
