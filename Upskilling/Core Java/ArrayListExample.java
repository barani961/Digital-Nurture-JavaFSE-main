import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();
        
        while (true) {
            System.out.print("Enter student name (or type 'done' to finish): ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("done"))
              {
                break;
               }
            students.add(name);
        }
        
        System.out.println("\nEntered Students:");
        
        for (String student : students) 
            System.out.println(student);
        
     
    }
}
