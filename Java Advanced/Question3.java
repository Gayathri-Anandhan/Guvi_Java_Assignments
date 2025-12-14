package Assignment4;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        String[] days = { "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday" };
        Scanner s = new Scanner(System.in);
        try {
            Integer n;
            System.out.println("Enter any index for week days between 0 to 6:");
            n = s.nextInt();
            System.out.println("Entered index belongs to:" + days[n]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index Entered! Pls select valid index between 0 to 6");
        } finally {
            s.close();
        }
    }
}
