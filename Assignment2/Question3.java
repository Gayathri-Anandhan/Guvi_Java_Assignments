class Account {
    double Balance;

    Account() {
        Balance = 0;
    }

    Account(Double Balance) {
        this.Balance = Balance;
    }

    void deposit(double Amount) {
        if (Amount > 0) {
            Balance += Amount;
            System.out.println("Amount Deposited:" + Amount);
        } else {
            System.out.println("Invalid Deposit");
        }
    }

    void withdraw(double Amount) {
        if (Amount > Balance) {
            System.out.println("Insufficient Balance!");
        } else {
            Balance -= Amount;
            System.out.println("Amount Withdrawn:" + Balance);
        }
    }

    void Display() {
        System.out.println("Available Balance" + Balance);
    }
}

public class Question3 {
    public static void main(String[] args) {
        Account Account1 = new Account();
        Account1.deposit(500);
        Account1.withdraw(100);
        Account1.Display();

    }
}
