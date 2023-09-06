import java.util.Scanner;
public class calculate {
    public static void main(String[] args) {

        // intro
        System.out.println("Console Calculator by dotzSimplicity - Java Edition.");
        System.out.println("Possible Operators: +, -, *, /, %");

        // num1
        System.out.println("Enter your first number: ");
        Scanner scanner = new Scanner(System.in);
        float num1 = scanner.nextFloat();
        scanner.nextLine();

        
        // operator
        System.out.println("Enter your operator: ");
        String operator = scanner.next();
        scanner.nextLine();

        // num2
        System.out.println("Enter your second number: ");
        float num2 = scanner.nextFloat();

        scanner.close();

        // calculation
        if (operator.equals("+")) {
            System.out.println(num1 + num2);
        } else if (operator.equals("-") ) {
            System.out.println(num1 - num2);
        } else if (operator.equals("*")) {
            System.out.println(num1 * num2);
        } else if (operator.equals("/")) {
            System.out.println(num1 / num2);
        } else if (operator.equals("%")) {
            System.out.println(num1 % num2);
        } else {
            System.out.println("Invalid Operator, please try again.");
            System.exit(0);
        }

    };
}
