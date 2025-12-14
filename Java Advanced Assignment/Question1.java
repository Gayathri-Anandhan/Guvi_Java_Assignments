package Assignment4;

import java.util.Scanner;

class AgeNotWIthinRangeException extends Exception {
    public AgeNotWIthinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Student {
    Integer RollNo;
    String Name;
    Integer Age;
    String Course;

    Student(Integer RollNo, String Name, Integer Age, String Course)
            throws AgeNotWIthinRangeException, NameNotValidException {
        if (Age < 15 || Age > 21) {
            throw new AgeNotWIthinRangeException("Age is not between 15 and 21");
        }
        if (!Name.matches("[a-zA-Z]+")) {
            throw new NameNotValidException("Invalid Name");
        }
        this.RollNo = RollNo;
        this.Name = Name;
        this.Age = Age;
        this.Course = Course;
    }

    void display() {
        System.out.println("*********************");
        System.out.println("RollNo:" + RollNo);
        System.out.println("NAme:" + Name);
        System.out.println("Age:" + Age);
        System.out.println("Course:" + Course);
        System.out.println("*********************");
    }
}

public class Question1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Enter RollNo:");
            Integer RollNo = s.nextInt();
            System.out.println("Enter Name:");
            String Name = s.next();
            System.out.println("Enter Age:");
            Integer Age = s.nextInt();
            System.out.println("Enter Course:");
            String Course = s.next();
            Student Student1 = new Student(RollNo, Name, Age, Course);
            System.out.println("Student Details:");
            Student1.display();
        } catch (AgeNotWIthinRangeException e) {
            System.out.println("Age Exception: " + e.getMessage());
        } catch (NameNotValidException e) {
            System.out.println("Name Exception: " + e.getMessage());
        } finally {
            s.close();
        }
    }
}
