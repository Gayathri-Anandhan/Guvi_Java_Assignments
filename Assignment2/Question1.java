//CLASS PERSON WITH PROPERTIES NAME & AGE
class person {
    String name;
    Integer age;

    // DEFAULT CONSTRUCTOR
    person() {
        this.name = "ABC";
        this.age = 18;
    }

    // PARAMETERISED CONSTRUCTOR
    person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    // METHOD TO DISPLAY NAME & AGE
    void display() {
        System.out.println(name);
        System.out.println(age);
    }
}

public class Question1 {
    public static void main(String[] args) {
        // person person1 = new person();
        // person1.display();
        // PERSON OBJECT INITIALISED WITH NAME & AGE
        person person2 = new person("Kpp", 16);
        person2.display();
    }
}
