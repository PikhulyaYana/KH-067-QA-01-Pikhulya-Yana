import java.util.Scanner;

public class ThirdPointOneClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        double num1 = sc.nextDouble();
        System.out.println("Choose on of the possible operations: +, -, *, /, %");
        char operator = sc.next().charAt(0);
        if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
            System.out.println("Enter the second number");
        } else
            System.out.println("Your input is not correct.");
        double num2 = sc.nextDouble();

        switch (operator) {
            case '+':
                System.out.println("Result = " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result = " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result = " + (num1 * num2));
                break;
            case '/':
                System.out.println("Result = " + (num1 / num2));
                break;
            case '%':
                System.out.println("Result = " + (num1 % num2));
                break;
                
        }
    }
}