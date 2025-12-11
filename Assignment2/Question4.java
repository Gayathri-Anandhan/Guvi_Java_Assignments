class Person {
    String Name;
    Integer age;

    Person(String Name, Integer age) {
        this.Name = Name;
        this.age = age;
    }
}

class Employee extends Person {
    Integer EmployeeID;
    Integer Salary;

    Employee(String Name, Integer age, Integer EmployeeID, Integer Salary) {
        super(Name, age);
        this.EmployeeID = EmployeeID;
        this.Salary = Salary;
    }

    void display() {
        System.out.println("Name:" + Name);
        System.out.println("Age:" + age);
        System.out.println("EmployeeID:" + EmployeeID);
        System.out.println("Salary:" + Salary);
    }
}

public class Question4 {
    public static void main(String[] args) {
        Employee employee = new Employee("ABC", 21, 001, 40000);
        employee.display();
    }
}
