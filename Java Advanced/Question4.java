package Assignment4;

import java.util.HashMap;

public class Question4 {
    static HashMap<String, Integer> studentGrades = new HashMap<>();

    static void addStudents(String StudentName, Integer Grade) {
        studentGrades.put(StudentName, Grade);
        System.out.println("Student Added successfully!");
    }

    static void removeStudent(String StudentName) {
        if (studentGrades.containsKey(StudentName)) {
            studentGrades.remove(StudentName);
            System.out.println("Student Removed Successfully!");
        } else {
            System.out.println("Student Not found!");
        }
    }

    static void displayStudent(String StudentName) {
        if (studentGrades.containsKey(StudentName)) {
            System.out.println("Grade of " + StudentName + " is :" + studentGrades.get(StudentName));
        } else {
            System.out.println("Student not found!");
        }
    }

    public static void main(String[] args) {
        addStudents("Student1", 100);
        addStudents("Student2", 90);
        removeStudent("Student2");
        displayStudent("Student1");
    }
}
