package Assignment3;

import java.util.Scanner;

interface Taxable {
    double salestax = 0.07;
    double incometax = 0.105;

    double calcTax();
}

class Employee implements Taxable {
    Integer EmpID;
    String Name;
    double salary;

    Employee(Integer EmpID, String Name, double salary) {
        this.EmpID = EmpID;
        this.Name = Name;
        this.salary = salary;
    }

    public double calcTax() {
        double yearlysalary = salary * 12;
        yearlysalary = yearlysalary * incometax;
        return yearlysalary;
    }
}

class product implements Taxable {
    Integer pid;
    double price;
    Integer quantity;

    product(Integer pid, double price, Integer quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    public double calcTax() {
        double taxAmount = price * salestax;
        return taxAmount;
    }
}

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID:");
        Integer EmpID = sc.nextInt();
        System.out.println("Enter Employee Name:");
        String Name = sc.next();
        System.out.println("Enter Salary:");
        double salary = sc.nextDouble();
        Employee Employee1 = new Employee(EmpID, Name, salary);
        System.out.println("The Income Tax is:" + Employee1.calcTax());

        System.out.println("--------------------------------");

        System.out.println("Enter Product ID:");
        Integer pid = sc.nextInt();
        System.out.println("ENter price of the product");
        double price = sc.nextDouble();
        System.out.println("Enter Quantity");
        Integer quantity = sc.nextInt();
        product Product1 = new product(pid, price, quantity);
        System.out.println("The Sales Tax is:" + Product1.calcTax());
        sc.close();
    }

}
