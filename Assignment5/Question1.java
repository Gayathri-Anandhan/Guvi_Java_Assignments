package Assignment5;

import java.util.stream.Stream;

public class Question1 {

    public static void main(String[] args) {

        Stream<String> names = Stream.of("aBc", "d", "ef");

        names
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
