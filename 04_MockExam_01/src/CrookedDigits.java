import java.util.Scanner;

public class CrookedDigits {

    static boolean TryParseDigit(String digit) {
        try {
            Integer.parseInt(digit);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numberString = scanner.nextLine(); //.replace("-", "");

        int number;

        do {
            int numberLength = numberString.length();
            int count = 0;
            int sum = 0;

            while (count < numberLength) {
                String digit = numberString.substring(count, count + 1);

                if (TryParseDigit(digit)) {
                    sum += Integer.parseInt(digit);
                }
                count++;
            }

            number = sum;
            numberString = String.valueOf(number);

        } while (number > 9);

        System.out.println(number);
    }
}
