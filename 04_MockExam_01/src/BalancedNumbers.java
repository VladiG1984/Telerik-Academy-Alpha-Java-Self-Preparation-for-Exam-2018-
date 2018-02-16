import java.text.SimpleDateFormat;
import java.util.Scanner;

public class BalancedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secondDigit = 0;
        int firstDigit = 0;
        int thirdDigit = 0;
        int sumNumbers = 0;

        do {
            int number3digit = Integer.parseInt(scanner.nextLine());
            firstDigit = number3digit / 100;
            secondDigit = (number3digit / 10) % 10;
            thirdDigit = (number3digit) % 10;

            if (secondDigit == (firstDigit + thirdDigit)) {
                sumNumbers +=number3digit;
            }
        } while (secondDigit == (firstDigit + thirdDigit));

        System.out.println(sumNumbers);
    }
}
