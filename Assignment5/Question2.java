package Assignment5;

import java.util.Arrays;
import java.util.List;

public class Question2 {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("abc", "be", "efg", "abcd", "", "jkl");

        strings.stream()
                .filter(s -> !s.isEmpty())
                .forEach(System.out::println);
    }
}
