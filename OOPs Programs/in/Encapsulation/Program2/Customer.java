package in.Encapsulation.Program2;

public class Customer {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("001","Virat Kohli");
        account.depositMoney(100);
        System.out.println(account.withdrawMoney(200));
        account.depositMoney(-40);
        account.withdrawMoney(0);
    }
}
