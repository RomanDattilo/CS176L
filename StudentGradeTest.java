
public class StudentGradeTest {

	

	public static void main(String[] args) {
		
        StudentGrade student1 = new StudentGrade("Roman");
        student1.setName("Roman");
        System.out.println("Student 1: Name = " + student1.getName() + ", Grade = " + student1.getGrade() + ", Grade Level = " + student1.retGradeLevel());

        StudentGrade student2 = new StudentGrade("Hannah", 95);
        student2.setName("Hannah");
        System.out.println("Student 2: Name = " + student2.getName() + ", Grade = " + student2.getGrade() + ", Grade Level = " + student2.retGradeLevel());

        StudentGrade student3 = new StudentGrade("Conner", 75);
        student3.setName("Conner");
        System.out.println("Student 3: Name = " + student3.getName() + ", Grade = " + student3.getGrade() + ", Grade Level = " + student3.retGradeLevel());

        StudentGrade student4 = new StudentGrade("Isiah", 110);
        student4.setName("Isiah");
        System.out.println("Student 4: Name = " + student4.getName() + ", Grade = " + student4.getGrade() + ", Grade Level = " + student4.retGradeLevel());
    }

	

}
