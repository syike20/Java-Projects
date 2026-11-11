import java.util.Scanner;

class ConsoleCalculator {
    //Scanner class
    static Scanner sc = new Scanner(System.in);

    public static void Addition(double a , double b){
        double add = a+b;
        System.out.println("Addition: " + add);
    }
    public static void Subtraction(double a , double b){
        double sub = a-b;
        System.out.println("Substraction: "+sub);
    }
    public static void Multiplication(double a , double b){
        double multi = a*b;
        System.out.println("Multiplication: "+multi);
    }
    public static void Division(double a , double b){
        if(b==0){
            System.out.println("Logical Error! Divison with zero is mathematically incorrect.");
            return;
        }
        double div = a/b;
        System.out.println("Division: "+div);
    }
    public static void main(String[] args){
        
        //Welcome Message
        System.out.println("CONSOLE CALCULATOR");
        System.out.println("------------------");
         System.out.println("Enter the first operand : ");
        double a = sc.nextDouble();
        System.out.println("Enter the second operand : ");
        double b = sc.nextDouble();
        boolean isRunning = true;
        //WHILE Loop
        while(isRunning){
            System.out.println("Enter 1 for Addition");
            System.out.println("Enter 2 for Subtraction");
            System.out.println("Enter 3 for Multiplication");
            System.out.println("Enter 4 for Division");
            System.out.println("Enter 5 for EXIT");
            //variable choice
            int choice = sc.nextInt();
            //switch
            switch(choice){
                case 1 -> Addition(a,b);
                case 2 -> Subtraction(a,b);
                case 3 -> Multiplication(a,b);
                case 4 -> Division(a,b);
                case 5 -> isRunning = false;
                default -> System.out.println("Enter a Valid Choice");
            }
        }
    }

}