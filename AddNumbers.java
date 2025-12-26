import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
	
        double num2 = scanner.nextDouble();

        // Calculate sum
        double sum = num1 + num2;
        double multiplication = num1 * num2;
        double subtraction = num1 - num2;
	// Display result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        System.out.println("The multiplication of " + num1 + " and " + num2 + " is: " + multiplication);
	System.out.println("The subtraction of "+ num1 + " and "+ num2 + " is: "+ subtraction);
        scanner.close();
    }
}

