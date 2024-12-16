import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hi! Welcome to the Calculator");



        System.out.println("What operation do you want to do? (add/subtract/multiply or divide)\n"); //asking what operation you want
        //input validation
        while (!sc.hasNext("add|subtract|multiply|divide")){
            System.out.println("Invalid Input");
            sc.next();
        }
        String operation = sc.next();



        System.out.println("Thank you!!");

        System.out.println("Now enter your first number: ");
        while (!sc.hasNextInt()){
            System.out.println("That's not a number!");
            sc.next();
        }
        double num1 = sc.nextDouble();


        System.out.println("The second number?: ");
        while (!sc.hasNextInt()){
            System.out.println("That's not a number!");
            sc.next();
        }
        double num2 = sc.nextDouble();

        double result = 0;
        boolean validOperation = true;


        //switch cases, makes it sooo much easier than the other way i was doing it.
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