import java.util.Scanner;

public class FinancialForecasting {

    public static double futureValue(double present, double growthRate, int years) {

        if (years == 0) {
            return present;
        }

        return futureValue(present, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Present Value: ");
        double present = sc.nextDouble();

        System.out.print("Enter Growth Rate: ");
        double growthRate = sc.nextDouble();

        System.out.print("Enter Number of Years: ");
        int years = sc.nextInt();

        double result = futureValue(present, growthRate, years);

        System.out.printf("\nFuture Value: %.2f", result);

        sc.close();
    }
}