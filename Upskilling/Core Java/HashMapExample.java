import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> studentMap = new HashMap<>();
            studentMap.put(1, "Arun");
            studentMap.put(2, "Barath");
            studentMap.put(3, "hari");
        
        
        System.out.print("\nEnter a Student ID to search: ");
        int searchId = scanner.nextInt();
        
        if (studentMap.containsKey(searchId)) {
            System.out.println("Student Name: " + studentMap.get(searchId));
        } else {
            System.out.println("ID not found.");
        }
        
        scanner.close();
    }
}
