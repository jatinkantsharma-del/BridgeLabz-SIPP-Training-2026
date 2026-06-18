import java.util.*;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String m) {
        super(m);
    }
}

class Bank {

    double bal = 5000;

    void withdraw(double amt) throws InsufficientBalanceException {

        if (amt < 0) {
            throw new IllegalArgumentException();
        }

        if (amt > bal) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        bal -= amt;

        System.out.println("Withdrawal successful, new balance: " + bal);
    }
}

public class BankTransactionSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bank b = new Bank();

        try {
            double amt = sc.nextDouble();
            b.withdraw(amt);
        }
        catch (InsufficientBalanceException e) {
            System.out.println("Insufficient balance!");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid amount!");
        }
    }
}