public interface BankInterface {

    int getBalance();
    String depositMoney(int amount);
    String withdraw(String password, int amount);
    double calculateInterest(int time);
}
