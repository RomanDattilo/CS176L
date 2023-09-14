package cs176;

public class University {
	public String universityName;
	public int Studentamount;
	
	public University(String name, int students) {
	universityName = name;
	Studentamount = students;
		
	}
	public String getName() {
		return universityName;
		
	}
	public int getStudents() {
		return Studentamount;
		
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	University univ1 = new University("Monmouth University", 8765);
	System.out.println(univ1.getName()+ " " + univ1.getStudents());

}
}