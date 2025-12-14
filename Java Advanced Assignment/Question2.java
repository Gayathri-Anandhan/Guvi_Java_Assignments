package Assignment4;

import java.util.Scanner;

class AgeNotValidException extends Exception {
    public AgeNotValidException(String message) {
        super(message);
    }
}

class voter {
    Integer VoterID;
    String Name;
    Integer Age;

    voter(Integer VoterID, String Name, Integer Age) throws AgeNotValidException {
        if (Age < 18) {
            throw new AgeNotValidException("Invalid Age for Voter");
        }
        this.VoterID = VoterID;
        this.Name = Name;
        this.Age = Age;
    }

    void display() {
        System.out.println("VoterID:" + VoterID);
        System.out.println("Name:" + Name);
        System.out.println("Age:" + Age);
    }
}

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter VoterID:");
            Integer VoterID = sc.nextInt();
            System.out.println("Enter Name:");
            String Name = sc.next();
            System.out.println("Enter Age:");
            Integer Age = sc.nextInt();
            voter voter1 = new voter(VoterID, Name, Age);
            System.out.println("Voter Details below:");
            voter1.display();
        } catch (AgeNotValidException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }

    }
}
