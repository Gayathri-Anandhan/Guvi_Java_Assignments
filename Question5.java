import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Purchase Amount:");
        Integer pur = sc.nextInt();
        // System.out.println("Enter discount percentage:");
        // Integer dis = sc.nextInt();
        Integer dis;
        if (pur < 500) {
            dis = 0;
        } else if (pur >= 500 && pur <= 1000) {
            dis = 10;
        } else {
            dis = 20;
        }
        Integer disamt = pur * dis / 100;
        Integer TotalAmt = pur - disamt;
        System.out.println("The total payable amount after dicount is " + TotalAmt);
        sc.close();
    }
}
