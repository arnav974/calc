import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.print('\u000C');
        Scanner in = new Scanner(System.in);

        System.out.print("Enter +, -, * or / : ");
        String op = in.next();

        if(op.equals("+") || op.equals("*")) {
            System.out.print("How many numbers? ");
            int n = in.nextInt();

            double result;

            if(op.equals("+"))
                result = 0;
            else
                result = 1;

            for(int i = 1; i <= n; i++) {
                System.out.print("Enter number " + i + ": ");
                double num = in.nextDouble();

                if(op.equals("+"))
                    result = result + num;
                else
                    result = result * num;
            }

            System.out.println("Answer = " + result);
        }
        else if(op.equals("-") || op.equals("/")) {
            System.out.print("Enter first number: ");
            double a = in.nextDouble();

            System.out.print("Enter second number: ");
            double b = in.nextDouble();

            if(op.equals("-")) {
                System.out.println("Answer = " + (a - b));
            }
            else {
                if(b != 0)
                    System.out.println("Answer = " + (a / b));
                else
                    System.out.println("Cannot divide by zero");
            }
        }
        else {
            System.out.println("Invalid operator");
        }

        in.close();
    }
}
