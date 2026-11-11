public class Main {
    public static void main(String[] args){
        Customer customer = new Customer("Rahul",22,"987643210",101,"Pune");
        Account account = new Account(1001,10000,"Savings",customer);

        account.displayAccountDetails();
        account.deposit(5000);
        account.withdraw(2000);
        account.checkBalance();
    }
}
