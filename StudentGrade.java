
public class StudentGrade {
	
	    
		
	    final int DEFAULT_GRADE = 60;
	    final int MAXIMUM_GRADE = 100;
	    final int MINIMUM_GRADE = 0;
	    final int A_GRADE = 90;
	    final int B_GRADE = 80;
	    final int C_GRADE = 70;
	    private int grade;
	    private String name;


	    public StudentGrade(String name) {
	        this.grade = DEFAULT_GRADE;
	    }
	    
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		} 
	   
	    public StudentGrade(String name, int grade) {
	        setGrade(grade);
}

public void setGrade(int grade) {
    if (grade >= MINIMUM_GRADE && grade <= MAXIMUM_GRADE) {
        this.grade = grade;
    } else {
        this.grade = DEFAULT_GRADE;
    }
}


public int getGrade() {
    return grade;
}


public String retGradeLevel() {
    if (grade >= A_GRADE) {
        return "A";
    } else if (grade >= B_GRADE) {
        return "B";
    } else if (grade >= C_GRADE) {
        return "C";
    } else {
        return "D";
    }
}}
