import java.util.Scanner;

public class PrimeTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberRange = Integer.parseInt(scanner.nextLine());
        String output = "";

        for (int number = 1; number <= numberRange ; number++) {

            boolean isPrime = true;

            for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {

                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (!isPrime) {
                output += '0';
            } else if (isPrime) {
                output += '1';
                System.out.println(output);
            }
        }
    }
}
