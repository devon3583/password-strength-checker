import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        scanner.close();

        int score = getPasswordScore(password);
        System.out.println("Password score: " + score + "/5");

        if (score < 3) {
            System.out.println("Weak password 🚫");
        } else if (score == 3 || score == 4) {
            System.out.println("Moderate password ⚠️");
        } else {
            System.out.println("Strong password ✅");
        }
    }

    public static int getPasswordScore(String password) {
        int score = 0;
    
        // 1. Length
        if (password.length() >= 8) score++;
    
        // 2. Has uppercase
        if (password.matches(".*[A-Z].*")) score++;
    
        // 3. Has lowercase
        if (password.matches(".*[a-z].*")) score++;
    
        // 4. Has digit
        if (password.matches(".*\\d.*")) score++;
    
        // 5. Has special character (any non-alphanumeric)
        if (password.matches(".*[^A-Za-z0-9].*")) score++;
    
        return score;
    }
}