
import java.util.Scanner;

public class Problem2week5 {
	

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
	        
System.out.print("Enter an integer number: ");
int firstn = scanner.nextInt();
	        
System.out.print("Enter an operator (+, -, *, /): ");
char operator = scanner.next().charAt(0);
	        
System.out.print("Enter another integer number: ");
int secondn = scanner.nextInt();
	        
double result = 0.0;
	        
     switch (operator) {
           case '+':
      result = firstn + secondn;
           break;
        case '-':
       result = firstn - secondn;
               break;
         case '*':
             result = firstn * secondn;
             break;
          case '/':
             if (secondn != 0) {
          result = (double) firstn / secondn;
           } else {
   System.out.println("Error: Division by zero");
         System.exit(1);
               }
            break;
        default:
 System.out.println("Invalid operator");
    System.exit(1);
       }
	        
  System.out.println("Result: " + result);
	        
    scanner.close();
    }
    {

}}
