import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int number3digit = Integer.parseInt(scanner.nextLine());

            int firstDigit = number3digit / 100;
            int secDigit = (number3digit / 10) % 10;
            int thirdDigit = number3digit % 10;

            int result1 = firstDigit * secDigit * thirdDigit;
            int result2 = (firstDigit * secDigit) + thirdDigit;
            int result3 = firstDigit + secDigit + thirdDigit;
            int result4 = firstDigit + (secDigit * thirdDigit);

            int finalResult = Math.max(Math.max(result1, result2), Math.max(result3, result4));

            System.out.println(finalResult);


    }
}
