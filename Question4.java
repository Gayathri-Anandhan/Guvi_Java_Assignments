import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Integer a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        a = sc.nextInt();
        System.out.println("Enter second number:");
        b = sc.nextInt();
        System.out.println("Enter third number:");
        c = sc.nextInt();

        if (a <= b && a <= c) {
            System.out.println("A is the smallest");
        } else if (b <= a && b <= c) {
            System.out.println("B is the smallest");
        } else {
            System.out.println("C is the smallest");
        }
        sc.close();
    }
}
