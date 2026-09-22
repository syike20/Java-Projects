
//# Console Calculator

/*A simple Java console-based calculator designed to practice 
and demonstrate fundamental programming concepts, including variables and data types, 
operators, conditional statements, switch-case, loops, methods, and user input handling.*/

import java.util.Scanner;
class ConsoleCalculator{
    public static double Addition(double n1, double n2){
        return n1 + n2 ;
    }
    public static double Subtraction(double n1, double n2){
        return n1 - n2 ;
    }
    public static double Multiplication(double n1 , double n2){
        return n1 * n2 ;
    }
    public static double Division(double n1 , double n2){
        if(n2==0){
            System.out.println("Mathematical Error !! Division by Zero.");
            return 0;
        }
        return n1 / n2 ;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //TITLE
        System.out.println("------------------");
        System.out.println("CONSOLE CALCULATOR");
        System.out.println("------------------");
        System.out.println();

        
        do{
        //USER INPUT 
            System.out.print("Enter First Operand  : ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter Second Operand : ");
            double num2 = scanner.nextDouble();

            System.out.print("Enter Operation Type (+,-,/,*) : ");
            String operation = scanner.next();

            switch(operation){
                case "+" -> System.out.println("Result :" + Addition(num1,num2));
                case "-" -> System.out.println("Result :" +Subtraction(num1,num2));
                case "*" -> System.out.println("Result :" +Multiplication(num1,num2));
                case "/" -> System.out.println("Result :" +Division(num1,num2));
                default ->  System.out.println(" Enter A Valid Coice !! "); 
            }
            
            System.out.print("To Continue Type 'CONTINUE' OR To Exit Type 'EXIT' : " );
            String choice = scanner.next();
            if(choice.equalsIgnoreCase("EXIT")){
                break;
            }else if(choice.equalsIgnoreCase("CONTINUE")){
                continue;
            }
            else{
                break;
            }
        }while(true);
        scanner.close();
        return;
        



    }
}