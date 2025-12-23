package Assignment5;

import java.util.Arrays;
import java.util.List;

public class Question3 {
    public static void main(String[] args) {

        List<String> students = Arrays.asList(
                "Arun", "Bala", "Anu", "Divya", "Ajay",
                "Karthik", "Aarthi", "Ravi", "Suresh", "Amala");

        students.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
    }
}
