import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        Integer n = sc.nextInt();
        Integer m = 0;
        for (; n > 0; n = n / 10) {
            Integer l = n % 10;
            m = m * 10 + l;
        }
        System.out.println(m);
        sc.close();
    }
}
