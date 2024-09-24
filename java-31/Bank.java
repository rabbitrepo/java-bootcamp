public class Bank {
    public static void main(String[] args) {
        Account a = new Account();
        a.deposit(1000);
        System.out.println(a.balance);

        a.withdraw(500);
        System.out.println(a.balance);

        a.withdraw(600);
        System.out.println(a.balance);
    }
}

class Account {
    double balance;

    void deposit(double amount) {
        this.balance += amount;
    }

    synchronized boolean withdraw(double amount) {
        if (this.balance < amount) {
            return false;
        }
        this.balance -= amount;
        return true;
    }
}
