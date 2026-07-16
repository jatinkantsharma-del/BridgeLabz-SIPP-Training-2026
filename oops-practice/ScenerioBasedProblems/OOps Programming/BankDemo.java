class BankAccount {
    private String accountNumber;
    private String holder;
    private double balance;

    static int totalAccounts = 0;

    BankAccount(String accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited.");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn.");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void getStatement() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Holder: " + holder);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}

public class BankDemo {
    public static void main(String[] args) {

        BankAccount a1 = new BankAccount("101", "Hemant", 10000);
        BankAccount a2 = new BankAccount("102", "Rahul", 15000);
        BankAccount a3 = new BankAccount("103", "Aman", 20000);

        a1.deposit(1000);
        a1.withdraw(500);
        a1.deposit(2000);
        a1.withdraw(1000);
        a1.deposit(500);

        a2.deposit(5000);
        a2.withdraw(3000);
        a2.deposit(1000);
        a2.withdraw(2000);
        a2.deposit(500);

        a3.deposit(4000);
        a3.withdraw(1500);
        a3.deposit(3000);
        a3.withdraw(1000);
        a3.deposit(700);

        a1.getStatement();
        a2.getStatement();
        a3.getStatement();

        System.out.println("Total Accounts: " + BankAccount.totalAccounts);
    }
}