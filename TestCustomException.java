package LAB10;

//Custom exception class
class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}
public class TestCustomException {

	 // Method that throws the custom exception
    public static void registerUser(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above to register.");
        } else {
            System.out.println("User registered successfully!");
        }
    }

    // Main method
    public static void main(String[] args) {
        try {
            int userAge = 15;  // You can change this value to test different scenarios
            registerUser(userAge);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
