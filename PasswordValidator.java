package LAB10;
public class PasswordValidator {

    // Method to validate password based on given criteria
    public static String validatePassword(String password) {
        if (password.length() < 8) {
            return "Invalid: Password must be at least 8 characters long.";
        }
        if (!password.matches(".*[A-Z].*")) {
            return "Invalid: Must include at least one uppercase letter.";
        }
        if (!password.matches(".*\\d.*")) {
            return "Invalid: Must include at least one numeric digit.";
        }
        if (!password.matches(".*[!@#$%^&*()].*")) {
            return "Invalid: Must include at least one special character (!@#$%^&*()).";
        }
        if (password.contains(" ")) {
            return "Invalid: Password cannot contain spaces.";
        }
        return "Valid";
    }

    public static void main(String[] args) {
        // 5 Test Cases
        String[] testPasswords = {
            "Passw0rd!",      // Valid
            "password123!",   // Invalid (no uppercase)
            "PASSW@RD",       // Invalid (no digit)
            "Pass word1!",    // Invalid (contains space)
            "Pa1!"            // Invalid (too short)
        };

        // Run each test
        for (int i = 0; i < testPasswords.length; i++) {
            String result = validatePassword(testPasswords[i]);
            System.out.println("Test Case " + (i + 1) + " - \"" + testPasswords[i] + "\": " + result);
        }
    }
}
