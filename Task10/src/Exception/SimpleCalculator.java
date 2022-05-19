package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleCalculator {

    public static double setDouble() {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                double num = 0;
                System.out.println("Enter a number.");
                num = sc.nextDouble();
                return num;
            } catch (InputMismatchException m) {
                System.out.println("Invalid number.");
            }
        }
    }


    public static String setSupportedOperation(String operation) throws NotSupportedOperationException {
        if ((operation.equals("+")) || (operation.equals("-")) || (operation.equals("*")) || (operation.equals("/")) ||
                (operation.equals("%"))) {
            return operation;
        } else {
            throw new NotSupportedOperationException();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        double res = 0;
        String operation;
        System.out.println("It's a calculator. It performs basic calculations such as +, -, *, /, %");
        num1 = setDouble();
        while (true) {
            try {
                System.out.println("Choose one of the possible operations: +, -, *, /, %");
                operation = sc.nextLine();
                setSupportedOperation(operation);
                break;
            } catch (NotSupportedOperationException e) {
                System.out.println(e.getMessage());
            }
        }
        num2 = setDouble();
        if (operation.equals("+")) {
            res = num1 + num2;
        } else if (operation.equals("-")) {
            res = num1 - num2;
        } else if (operation.equals("*")) {
            res = num1 * num2;
        } else if (operation.equals("/")) {
            res = num1 / num2;
        } else if (operation.equals("%")) {
            res = num1 % num2;
        }
        System.out.println(res);
    }
}






