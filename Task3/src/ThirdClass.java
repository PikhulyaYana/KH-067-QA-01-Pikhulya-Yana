import java.util.Scanner;

public class ThirdClass {
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

        if (operator == '+') {
            double res = num1 + num2;
            System.out.println(res);
        } else if (operator == '-') {
            double res = num1 - num2;
            System.out.println(res);
        } else if (operator == '*') {
            double res = num1 * num2;
            System.out.println(res);
        } else if (operator == '/') {
            double res = num1 / num2;
            System.out.println(res);
        } else if (operator == '%') {
            double res = num1 % num2;
            System.out.println(res);
        }
    }
}


