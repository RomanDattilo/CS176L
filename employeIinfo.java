package cs176;

public class employeIinfo {
	


	public static void main(String[] args) {
Employee roman = new Employee("romandattilo", 85000);
System.out.println(roman.getName());
System.out.println(roman.getSalary());
roman.raiseSalary(10);
System.out.println(roman.getSalary());

}}
