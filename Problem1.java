
//Roman, Camryn, Ivan

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    String id;
    ArrayList<Grade> grades;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void addGrade(int testNumber, int score) {
        grades.add(new Grade(testNumber, score));
    }

    public int getGrade(int testNumber) {
        for (Grade grade : grades) {
            if (grade.testNumber == testNumber) {
                return grade.score;
            }
        }
        return -1;
    }
}

class Grade {
    int testNumber;
    int score;

    public Grade(int testNumber, int score) {
        this.testNumber = testNumber;
        this.score = score;
    }
}

class Course {
    String courseName;
    String department;
    String level;
    ArrayList<Student> students;

    public Course(String courseName, String department, String level) {
        this.courseName = courseName;
        this.department = department;
        this.level = level;
        this.students = new ArrayList<>();
    }

    public void addStudent(String name, String id) {
        students.add(new Student(name, id));
    }

    public void addGrade(String studentId, int testNumber, int score) {
        for (Student student : students) {
            if (student.getId().equals(studentId)) {
                student.addGrade(testNumber, score);
                return;
            }
        }
        System.out.println("Error, no student with id '" + studentId + "' registered in this class.");
    }

    public void printGrade(int testNumber) {
        for (Student student : students) {
            int score = student.getGrade(testNumber);
            if (score != -1) {
                System.out.println(student.name + " " + score);
            }
        }
    }

    public void sortGrade(int testNumber) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < students.size() - 1; i++) {
                int score1 = students.get(i).getGrade(testNumber);
                int score2 = students.get(i + 1).getGrade(testNumber);
                if (score1 < score2) {

                    Student temp = students.get(i);
                    students.set(i, students.get(i + 1));
                    students.set(i + 1, temp);
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public void updateGrade(String studentId, int newScore) {
        for (Student student : students) {
            if (student.getId().equals(studentId)) {
                student.grades.set(0, new Grade(1, newScore));
                return;
            }
        }
        System.out.println("Error, no student with id '" + studentId + "' registered in this class.");
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Course cs176l = new Course("cs176l", "Computer science", "undergraduate");
        cs176l.addStudent("Cream", "00001");
        cs176l.addStudent("Oreo", "00002");
        cs176l.addStudent("Derek", "00003");

        Scanner scanner = new Scanner(System.in);

        // Input grades for students
        for (Student student : cs176l.students) {
            System.out.print("Enter test number for " + student.name + ": ");
            int testNumber = scanner.nextInt();
            System.out.print("Enter score for " + student.name + ": ");
            int score = scanner.nextInt();
            cs176l.addGrade(student.id, testNumber, score);
        }

        // Print grades for a specific test
        System.out.print("Enter test number to print grades: ");
        int testNumberToPrint = scanner.nextInt();
        cs176l.printGrade(testNumberToPrint);

        // Sort and print grades for a specific test
        cs176l.sortGrade(testNumberToPrint);
        System.out.println("Grades after sorting:");
        cs176l.printGrade(testNumberToPrint);

        // Update a student's grade
        System.out.print("Enter student id to update grade (4 zeros and a #): ");
        String studentIdToUpdate = scanner.next();
        System.out.print("Enter new score: ");
        int newScore = scanner.nextInt();
        cs176l.updateGrade(studentIdToUpdate, newScore);

        
        System.out.println("Grades after updating:");
        cs176l.printGrade(testNumberToPrint);

        
        System.out.print("Enter student id to add a new grade: ");
        String newStudentId = scanner.next();
        System.out.print("Enter test number for the new grade: ");
        int newTestNumber = scanner.nextInt();
        System.out.print("Enter score for the new grade: ");
        int newTestScore = scanner.nextInt();
        cs176l.addGrade(newStudentId, newTestNumber, newTestScore);

        
        System.out.print("Enter test number to print grades for the new test: ");
        int newTestNumberToPrint = scanner.nextInt();
        cs176l.printGrade(newTestNumberToPrint);
    }
}
