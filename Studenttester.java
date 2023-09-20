package problem1;

public class Studenttester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Student Roman = new Student("Roman");
 Roman.addQuiz(85);
 Roman.addQuiz(83);
 Roman.addQuiz(87);
 Roman.addQuiz(90);
 Roman.addQuiz(86);	
 System.out.println(Roman.getScores());
 System.out.println(Roman.getName());
 System.out.println(Roman.getAverageScore());
 
	}

}
