import java.util.Scanner;



public class Problem2 {
	



	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a positive number: ");
	        int num1 = scanner.nextInt();
            while(num1 < 0 || num1 > 1000){
            System.out.print("Enter a positive number: ");
            num1 = scanner.nextInt();
            }
	        System.out.print("Enter another positive number: ");
	        int num2 = scanner.nextInt();
	        while(num2 < 0 || num2 > 1000){
	            System.out.print("Enter a positive number: ");
	            num2 = scanner.nextInt();
	        }
	        int gcd = calculateGCD(num1, num2);

	        System.out.println("The GCD of " + num1 + " and " + num2 + " is " + gcd);

	        scanner.close();
	    }

	    public static int getValidInput(Scanner scanner) {
	       
	    	   
	       
	    	int num;
	     
	        while (true) {
	            try {
	                num = Integer.parseInt(scanner.nextLine());
	                if (num >= 0 && num <= 1000) {
	                    return num;
	                } else {
	                    System.out.println("Please enter a number in the range 0 to 1000.");
	                }
	            } catch (NumberFormatException e) {
	                System.out.println("This is an invalid number. Please enter a correct number.");
	            }
	        }
	    }

	    public static int calculateGCD(int num1, int num2) {
	        while (num2 != 0) {
	            int temp = num2;
	            num2 = num1 % num2;
	            num1 = temp;
	        }
	        return num1;
	    }
	{}

}
