public class Account {
    private int accountNumber ;
    private double balance ;
    private String accountType ;
    private Customer customer ;

    Account(int accountNumber, double balance , String accountType , Customer customer){
        this.accountNumber = accountNumber ;
        if(this.balance <=0){
           System.out.println( "Please Enter a Valid Balance");
        }else{
            this.balance = balance ;
        }
        
        this.accountType = accountType ;
        this.customer = customer ; 
    }

    //Getters 

    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public String getAccountType(){
        return accountType;
    }
    public Customer getCustomer(){
        return customer;
    }
    
    //Setters

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber ;
    }

    public void setAccountType(String accountType){
        if(!"Savings".equals(accountType) && !"Current".equals(accountType)){
            System.out.println("Enter Valid Account Type !");
        }else{
            this.accountType = accountType ;
        }
    }

    public void setCustomer(Customer customer){
        this.customer = customer; 
    }

    //Deposit Method
    public void deposit( double  amount){
        if(amount <= 0){
            System.out.println("Enter Valid Amount !");
        }else{
            balance = amount+balance;
        }

    }   
    //Withdraw Method 
    public void withdraw( double amount){
        if(balance<amount){
            System.out.println("Insufficient Balance");
        }
        else if(amount <=0){
            System.out.println("Enter Valid Amount !");
        }
        else{
            balance = balance - amount ;
            System.out.println("Successful Withdrawal");
        }
    }

    public void checkBalance(){
        System.out.println("Balance: "+balance);
    }

    public void displayAccountDetails(){
        customer.displayCustomerDetails();
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
        System.out.println("Account Type: "+accountType);
    }

}
