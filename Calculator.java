import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char op;
        int num1,num2;

        System.out.println("Enter 1st number: ");
        num1 = sc.nextInt();

        System.out.println("Enter 2nd number: ");
        num2 = sc.nextInt();

        System.out.println("Enter operator: ");
        op = sc.next().charAt(0);


        switch (op){
            case '+': System.out.println("Addition Result is: "+(num1+num2));
            break;

            case '-': System.out.println("Subtraction Result is: "+(num1-num2));
            break;

            case '*': System.out.println("Multiplication Result is: "+(num1*num2));
            break;

            case '/': System.out.println("Division Result is: "+(num1/num2));
            break;

            case '%': System.out.println("Remainder is: "+(num1%num2));
            break;

            default:System.out.println("Invalid operator!!..Enter something from(+,-,*,/,%)");
        }
    }
}


