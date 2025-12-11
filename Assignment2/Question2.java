import java.util.Scanner;

class Product {
    Integer pid;
    double price;
    Integer quantity;

    Product(Integer pid, double price, Integer quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
}

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ARRAY TO STORE 5 PRODUCTS
        Product[] product = new Product[5];
        System.out.println("Enter 5 product Details(Pid,Product,Quantity) :");

        // TAKE INPUT FOR 5 PRODUCTS
        for (Integer i = 0; i < 5; i++) {
            System.out.println("Enter Details of Product " + (i + 1) + ":");
            Integer pid = sc.nextInt();
            Double price = sc.nextDouble();
            Integer quantity = sc.nextInt();
            // CREATE AN OBJECT AND STORE IN ARRAY
            product[i] = new Product(pid, price, quantity);
        }
        // FIND PID OF PRODUCT WITH HIGHEST PRICE
        double maxprice = product[0].price;
        Integer maxpid = product[0].pid;
        for (Integer i = 0; i < 5; i++) {
            if (product[i].price > maxprice) {
                maxprice = product[i].price;
                maxpid = product[i].pid;
            }
        }
        System.out.println("Pid of the product with maximum price is :" + maxpid);
        double total = totalAmount(product);
        System.out.println("Total Amount spent on all products: " + total);
        sc.close();
    }

    public static double totalAmount(Product[] product) {
        double total = 0;
        for (Product p : product) {
            total += p.price * p.quantity;
        }
        return total;
    }
}
