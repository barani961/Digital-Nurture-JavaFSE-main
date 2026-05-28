import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first number:");
        num1=sc.nextInt();
        System.out.println("Enter second number:"); 
        num2=sc.nextInt();
        
        System.out.println("Enter an operator (+, -, *, /):");
        char operator=sc.next().charAt(0);
         
        switch(operator){

            case '+':
                System.out.println("Sum: "+(num1+num2));
                break;

            case '-':
                System.out.println("Difference: "+(num1-num2));
                break;

            case '*':
                System.out.println("Product: "+(num1*num2));
                break;

            case '/':
                if(num2!=0)
                    System.out.println("Quotient: "+(num1/num2));
                else
                    System.out.println("Error: Division by zero is not allowed");
                break;

            default:
                System.out.println("Invalid operator");
        }
    }
}
