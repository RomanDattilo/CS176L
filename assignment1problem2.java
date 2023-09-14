package cs176;

public class assignment1problem2 {
public assignment1problem2(String name) {
	super();
	this.name=name;
	this.quizNumber=0;
	this.quizScore=0;
}
public String getName() {
	return name;
}
public void addQuiz(int score) {
	this.quizScore+=score;
	quizNumber++;
}
public double getAverageScore() {
	return quizScore/quizNumber;
}
private String name;
private int quizScore;
private int quizNumber;



public static void main(String[] args) {
	assignment1problem2 student = new assignment1problem2("Roman");
	student.addQuiz(87);
	student.addQuiz(90);
	student.addQuiz(73);
	student.addQuiz(91);
	student.addQuiz(84);
	
	System.out.print("Student: "+student.getName());
	System.out.print("Total quiz score: "+student.getTotalScore());
	System.out.print("Average quiz score: "+student.getAverageScore());
}
private String getTotalScore() {
	// TODO Auto-generated method stub
	return null;
}
	
	
}



