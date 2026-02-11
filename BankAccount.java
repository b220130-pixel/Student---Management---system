import java.util.Scanner;

public class BankAccount {

    double balance = 0;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();

        System.out.print("Enter amount to deposit: ");
        double d = sc.nextDouble();
        acc.deposit(d);

        System.out.print("Enter amount to withdraw: ");
        double w = sc.nextDouble();
        acc.withdraw(w);
    }
}