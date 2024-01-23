import java.util.Scanner;
public class calculate { //i'll admit, it's not the best.
    public static void main(String[] args) {

        // intro
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

        //le calculation
        switch(operator){
            case "+":
            System.out.println(num1 + num2);
            break;
            case "-":
            System.out.println(num1 - num2);
            break;
            case "*":
            System.out.println(num1 * num2);
            break;
            case "/":
            System.out.println(num1 / num2);
            break;
            case "%":
            System.out.println(num1 % num2);
            break;
            default:
            System.out.println("Invalid Operator");
            break;
        }
        System.exit(0);
    };
}
