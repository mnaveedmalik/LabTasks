package LAB10;

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        
        try {
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } 
        catch (InputMismatchException e) {
            System.out.println("Invalid input! That's not an integer.");
        } 
        finally {
            scanner.close();
            System.out.println("Program complete.");
        }
    }
}
