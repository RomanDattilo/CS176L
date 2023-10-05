import java.util.Scanner;

public class problem1week5 {
	public static void main(String[] args) {
	    	
Scanner scanner = new Scanner(System.in);
	        
System.out.print("Enter the first name: ");
 String Roman = scanner.nextLine();
	        
  System.out.print("Enter the second name: ");
 String Conner= scanner.nextLine();
	        
  if (Roman.equals(Conner)) {
     System.out.println("Same name: " + Roman);
      } else {
        System.out.println(Roman + " and " + Conner + " are different");
       }
	        
    scanner.close();
	     }}
	
	