import java.util.Scanner;

public class ToKilometers {
    public static double multiply(double input) {
        return input * 1.60934;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in miles: ");
        double input = scanner.nextDouble();

        double result = multiply(input);
        System.out.println(result + " kilometers");

        scanner.close();
    }
}
