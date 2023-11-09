
//Roman, Camryn, Ivan


import java.util.ArrayList;

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
                    // Swap students without using Collections
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
                student.grades.set(0, new Grade(1, newScore)); // Update the score for test 1
                return;
            }
        }
        System.out.println("Error, no student with id '" + studentId + "' registered in this class.");
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Course cs176l = new Course("cs176l", "Computer science", "undergraduate");
        cs176l.addStudent("Cream", "0000001");
        cs176l.addGrade("0000001", 1, 98);
        cs176l.addStudent("Oreo", "0000002");
        cs176l.addGrade("0000002", 1, 99);
        cs176l.printGrade(1);
        cs176l.sortGrade(1);
        cs176l.printGrade(1);
        cs176l.updateGrade("0000001", 100);
        cs176l.printGrade(1);
        cs176l.sortGrade(1);
        cs176l.printGrade(1);
        cs176l.addGrade("0000003", 2, 88);
        cs176l.addStudent("Derek", "0000003");
        cs176l.addGrade("0000003", 2, 88);
        cs176l.printGrade(2);
    }
}
