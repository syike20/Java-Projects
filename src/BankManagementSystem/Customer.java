public class Customer extends Person {
    private int customerId;
    private String address ;

    Customer(String name , int age , String number , int customerId , String address){
        super(name,age,number);
        this.customerId = customerId;
        this.address = address;
    }
    //Getters
    public int getCustomerId(){
        return customerId;
    }
    public String getAddress(){
        return address;
    }
    //Setters
    public void setCustomerId(int customerId){
        this.customerId = customerId;
    }
    public void setAddress(String address){
        this.address = address;
    }

    //Method
    public void displayCustomerDetails(){
        displayPersonDetails();
        System.out.println("Customer ID: "+customerId);
        System.out.println("Address: "+address);
    }

}
