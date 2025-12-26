
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
~
AddNumbers.java [unix] (05:29 01/01/1970)                                            0,0-1 All
-- VISUAL BLOCK --                                                                 1x1
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

        // Display result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        scanner.close();
    }
}

