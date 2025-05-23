package LAB10;

public class ArithmeticExceptionExample { // Rename the class to avoid conflict
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a / b;
            System.out.println("The result is: " + result);
        } 
        catch (ArithmeticException e) { 
            System.out.println("Oops! You can’t divide by zero. (" + e + ")");
        }
    }
}
