import java.util.Scanner;
public class ConsoleCalculator {
    public static void main(String[] args){
        System.out.println("------------------");
        System.out.println("CONSOLE CALCULATOR");
        System.out.println("------------------");
        Scanner scanner = new Scanner(System.in);
        
       while(true){ 


            System.out.println("Choose operation to perform");

            System.out.println("Enter 1 for Addition");
            System.out.println("Enter 2 for Subtraction");
            System.out.println("Enter 3 for Multiplication");
            System.out.println("Enter 4 for Division");
            System.out.println("Enter 5 for EXIT");

            int choice = scanner.nextInt();

            switch(choice){
                case 1 -> {
                    System.out.print("Enter your first operand:");
                    int a = scanner.nextInt();
                    System.out.print("Enter your second operand:");
                    int b = scanner.nextInt();
                    int result = a + b ; 
                    System.out.println("Result : " + result );

                }
                case 2 -> {
                    System.out.print("Enter your first operand:");
                    int a = scanner.nextInt();
                    System.out.print("Enter your second operand:");
                    int b = scanner.nextInt();
                    int result  = a - b ;
                    System.out.println("Result : " + result );

                }
                case 3 -> {
                    System.out.print("Enter your first operand:");
                    int a = scanner.nextInt();
                    System.out.print("Enter your second operand:");
                    int b = scanner.nextInt();
                    int result = a * b ;
                    System.out.println("Result : " + result );

                }
                case 4 -> {
                    System.out.print("Enter your first operand:");
                    double a = scanner.nextInt();
                    System.out.print("Enter your second operand:");
                    double b = scanner.nextInt();
                    if(b==0){
                        System.out.println("Logic Error : Division by Zero.");
                        break;
                    }
                    double result = a / b ;
                    System.out.println("Result : " + result );

                }
                case 5 -> {
                    System.out.println("CLOSING......please wait.");
                    System.out.println("CALCULATOR CLOSED");
                    scanner.close();
                    return;
                }
                default -> {
                    System.out.print("Invalid Choice!Try Again.");
                }
            }

            
        }
        
    }



}
   



    
