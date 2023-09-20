package problem1;

public class Student {
	private String name;
	private double scores;
	private int testNumber;
	public Student(String studentName) {
		name = studentName;
		scores = 0;
		testNumber = 0;
		
	}
public String getName() {
	return name;
	
}
public void addQuiz(int score) {
	scores+= score;
	testNumber+= 1;
	
}

public double getTotalScore() {
	return scores;
	
}

public double getAverageScore() {
	return scores / testNumber;
	
}

public double getScores() {
	return scores;
	
}

	

}
