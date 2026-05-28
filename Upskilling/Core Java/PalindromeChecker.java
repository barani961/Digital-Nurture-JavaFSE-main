import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String original = scanner.nextLine();
        
        String cleaned = original.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        
        if (cleaned.equals(reversed)) {
            System.out.println("\"" + original + "\" is a palindrome.");
        } 
        else {
            System.out.println("\"" + original + "\" is NOT a palindrome.");
        }
    }
}
