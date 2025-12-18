class Account {
    double balance = 1000;

    void withdraw(double amt) {
        balance -= amt;
    }
}

class SavingsAccount extends Account {
    void withdraw(double amt) {
        if (balance - amt >= 500)
            balance -= amt;
        else
            System.out.println("Minimum balance required");
    }
}

public class Bank {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.withdraw(600);
        System.out.println(sa.balance);
    }
}
