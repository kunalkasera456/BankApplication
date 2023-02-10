import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name, password and minimum balance you deposite");

        String name = sc.next();
        String password = sc.next();
        int balance = sc.nextInt();

        SBIAccount kunalAcc = new SBIAccount(name, balance, password);
        System.out.println("Your account has been created with Account number" + kunalAcc.getAccountNo());

        //  get balance
        System.out.println("Your current balance is:" + kunalAcc.getBalance());

        //  deposite
        System.out.println(kunalAcc.depositMoney(500));
        System.out.println("Your current balance is:" + kunalAcc.getBalance());

        //  withdraw
        System.out.println("Enter amount to be withdrawn");
        int amount = sc.nextInt();

        System.out.println("Enter password");
        String enterdPassword = sc.next();

        System.out.println(kunalAcc.withdraw(enterdPassword, amount));
        System.out.println("Your current balance is :" + kunalAcc.getBalance());

        //  interest
        System.out.println("Interes for 4 years on current balance" + kunalAcc.getBalance() + "is" + kunalAcc.calculateInterest(4));
    }
}