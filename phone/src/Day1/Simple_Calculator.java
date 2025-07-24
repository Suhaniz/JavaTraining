package Day1;

 import java.util.Scanner;

  public class Simple_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int result = 0;

        if (op == '+') {
            result = a + b;
        } else if (op == '-') {
            result = a - b;
        } else if (op == '*') {
            result = a * b;
        } else if (op == '/') {
            result = a / b;
        } else {
            System.out.println("Invalid operator!");
            return;
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}

