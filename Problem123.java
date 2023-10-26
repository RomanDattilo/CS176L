import java.util.Scanner;

public class Problem123 {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.print("Enter a sentence: ");
		        String input = scanner.nextLine();
		        System.out.println("Before removing the white spaces: " + input);
		        
		        
		        String stringWithoutSpaces = input.replaceAll("\\s", "");
		        
		        System.out.println("After removing the white spaces: " + stringWithoutSpaces);
		    
		

        

	{
	Scanner var = new Scanner(System.in);
	String str = "";
	System.out.print("Enter string to reverse: ");
	
	str = var.nextLine();
	
	String reverse ="";
	for (int i = str.length()-1;i>=0;i--)
	{
		reverse = reverse+str.charAt(i);
		
	}
	System.out.println("Reversed string is: "+"\t"+reverse);
	
	
	}
	{
	String characters = "Happy Halloween";
	
	characters = characters.replace("H","B");
	
	System.out.printf("%s", characters);
	
	
	
	
}
	
	
	
	
	
	
	}
	
	}

