import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        Integer n = sc.nextInt();
        if (n > 0) {
            System.out.println("The Input is Positive");
        } else if (n < 0) {
            System.out.println("The input is negative");
        } else {
            System.out.println("The input is zero");
        }
        sc.close();
    }
}
