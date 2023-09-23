package cs176;

public class Bug_Test {

	 public static void main(String[] args) {
	        Bug bug = new Bug(0); 
	        System.out.println("Initial Position: " + bug.getPosition());

	        bug.move(); 
	        System.out.println("Current Position: " + bug.getPosition());

	        bug.turn(); 
	        bug.move(); 
	        System.out.println("Current Position: " + bug.getPosition());

	        bug.turn(); 
	        bug.move(); 
	        System.out.println("Current Position: " + bug.getPosition());
}}