public class Question6 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (j < i) {
                    System.out.print((n - j + 1) + " ");
                } else {
                    System.out.print((n - i + 1) + " ");
                }
            }

            System.out.println();
        }
    }
}
