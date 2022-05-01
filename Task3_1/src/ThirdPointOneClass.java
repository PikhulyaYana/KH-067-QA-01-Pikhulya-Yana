import java.util.Scanner;

public class ThirdPointOneClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;
        char operator;
        System.out.println("Enter the first number");
        num1 = sc.nextDouble();
        System.out.println("Choose on of the possible operations: +, -, *, /, %");
        operator = sc.next().charAt(0);
        if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
            System.out.println("Enter the second number");
            num2 = sc.nextDouble();

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
        } else
            System.out.println("Your input is not correct.");
    }
}


