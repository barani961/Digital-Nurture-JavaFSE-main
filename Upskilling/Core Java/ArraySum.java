import java.util.Scanner;
public class ArraySum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] numbers =new int[size];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < size; i++) {
            sum += numbers[i];
        }

        System.out.println("The sum of the array is: " + sum);
    }
}
