import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hi! Welcome to the Calculator");
        System.out.println("What operation do you want to do? (add/subtract/multiply or divide)\n");
        String operation = sc.nextLine();
        System.out.println("Thank you!!");

        System.out.println("Now enter your first number: ");
        double num1 = sc.nextDouble();

        System.out.println("The second number?: ");
        double num2 = sc.nextDouble();

        double result = 0;
        boolean validOperation = true;

        result = switch (operation.toLowerCase()) {
            case "add" -> num1 + num2;
            case "subtract" -> num1 - num2;
            case "multiply" -> num1 * num2;
            case "divide" -> num1 / num2;
            default -> result;
        };
        System.out.println("Here is your result: " + result);
    }
}