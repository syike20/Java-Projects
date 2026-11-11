import java.util.Scanner;
class AtmSimulator{
    static Scanner sc = new Scanner(System.in);
    public static double withdrawl(int currentPin , double balance){
        System.out.println("Enter your current pin for verification.");
        int checkPin = sc.nextInt();
        if(currentPin == checkPin){
            System.out.println("Verification Successfull ! ");
            System.out.print("Enter Amount : ");
            double amount = sc.nextDouble();
            if(balance>=amount){
                balance -= amount;
                System.out.println("Operation performed Successfully.");

            }else{
            System.out.println("Insufficient Balance");
        }
        }else{
            System.out.println("Incorrect PIN !! TRY AGAIN.");
        }
        return balance;
    }
    public static double deposit(int currentPin , double balance){
        System.out.println("Enter your current pin for verification.");
        int checkPin = sc.nextInt();
        if(currentPin == checkPin){
            System.out.println("Verification Successfull ! ");
            System.out.print("Enter Amount : ");
            double amount = sc.nextDouble();
            if(amount!=0 && amount>0){
                balance = amount + balance;
                System.out.println("Operation performed Successfully.");
            }
            else{
                System.out.println("Enter a Valid Amount.");
            }
        }
        else{
            System.out.println("Incorrect PIN !! TRY AGAIN.");
            }
        return balance;
        
    }
    public static void checkInfo(int currentPin , double balance){
        System.out.println("Enter your current pin for verification.");
        int checkPin = sc.nextInt();
        if(currentPin == checkPin){
            System.out.println("Account Balance : " + balance);
        }
        else{
            System.out.println("Incorrect PIN !! TRY AGAIN.");
        }
        
    }
    public static void main(String[] args){
        

        System.out.println("Automated Teller Machine");
        
        double balance = 0 ;
        int currentPin = 0 ;
        boolean isRunning = true;
        while(isRunning){
            System.out.println("-----MENU-----");
            System.out.println("PRESS 1 : CREATE PIN");
            System.out.println("PRESS 2 : CHANGE PIN");
            System.out.println("PRESS 3 : WITHDRAW AMOUNT");
            System.out.println("PRESS 4 : DEPOSIT AMOUNT");
            System.out.println("PRESS 5 : CHECK BALANCE");
            System.out.println("PRESS 6 : EXIT");
            System.out.println("--------------");
            System.out.print("Enter choice :");
            int choice  = sc.nextInt();
            switch(choice){
                case 1 -> {if(currentPin==0){
                    System.out.print("Enter PIN :");
                    currentPin = sc.nextInt();
                }else{
                    System.out.println("You have already set your Pin");
                }
                }
                case 2 ->{
                    System.out.println("Enter your current pin for verification.");
                    int checkPin = sc.nextInt();
                    if(currentPin == checkPin){
                        System.out.println("Verification Successfull ! ");
                        System.out.print("Enter new PIN :");
                        int newPin = sc.nextInt();
                        currentPin = newPin ;
                    }else{
                        System.out.println("Incorrect PIN !! TRY AGAIN.");
                    }
                }
                case 3 -> balance = withdrawl(currentPin , balance);
                case 4 -> balance = deposit(currentPin , balance);
                case 5 -> checkInfo(currentPin , balance);
                case 6 -> isRunning = false;
                default -> System.out.println("Try Again!.");
            }
        }
    }
}