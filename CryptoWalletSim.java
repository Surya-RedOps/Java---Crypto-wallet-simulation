import java.util.*;

class Wallet {
    private String owner;
    private double balance;

    Wallet(String owner) {
        this.owner = owner;
        this.balance = 0.0;
    }

    public String getOwner() { return owner; }
    public double getBalance() { return balance; }

    public void deposit(double amt) {
        balance += amt;
        System.out.println(owner + " received " + amt + " coins");
    }

    public void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            System.out.println(owner + " sent " + amt + " coins");
        } else {
            System.out.println("Not enough balance!");
        }
    }
}

class Transaction {
    private String from, to;
    private double amount;

    Transaction(String from, String to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public void printTx() {
        System.out.println(from + " → " + to + " : " + amount + " coins");
    }
}

public class CryptoWalletSim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first user name: ");
        Wallet w1 = new Wallet(sc.nextLine());

        System.out.print("Enter second user name: ");
        Wallet w2 = new Wallet(sc.nextLine());

        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Transfer\n4. Show Balance\n5. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter user (1 or 2): ");
                    int dUser = sc.nextInt();
                    System.out.print("Enter amount: ");
                    double dAmt = sc.nextDouble();
                    if (dUser == 1) w1.deposit(dAmt);
                    else w2.deposit(dAmt);
                    break;

                case 2:
                    System.out.print("Enter user (1 or 2): ");
                    int wUser = sc.nextInt();
                    System.out.print("Enter amount: ");
                    double wAmt = sc.nextDouble();
                    if (wUser == 1) w1.withdraw(wAmt);
                    else w2.withdraw(wAmt);
                    break;

                case 3:
                    System.out.print("Enter amount to transfer from 1 → 2: ");
                    double tAmt = sc.nextDouble();
                    if (tAmt <= w1.getBalance()) {
                        w1.withdraw(tAmt);
                        w2.deposit(tAmt);
                        Transaction t = new Transaction(w1.getOwner(), w2.getOwner(), tAmt);
                        t.printTx();
                    } else {
                        System.out.println("Transfer failed! Not enough balance.");
                    }
                    break;

                case 4:
                    System.out.println(w1.getOwner() + " Balance: " + w1.getBalance());
                    System.out.println(w2.getOwner() + " Balance: " + w2.getBalance());
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
