import java.util.Scanner;

public class DigitAsWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int digit = Integer.parseInt(scanner.nextLine());
            String digitInWords = "not a digit";

            switch(digit) {
                case 0:
                    digitInWords = "zero";
                    break;
                case 1:
                    digitInWords = "one";
                    break;
                case 2:
                    digitInWords = "two";
                    break;
                case 3:
                    digitInWords = "three";
                    break;
                case 4:
                    digitInWords = "four";
                    break;
                case 5:
                    digitInWords = "five";
                    break;
                case 6:
                    digitInWords = "six";
                    break;
                case 7:
                    digitInWords = "seven";
                    break;
                case 8:
                    digitInWords = "eight";
                    break;
                case 9:
                    digitInWords = "nine";
                    break;
            }
            System.out.println(digitInWords);
        } catch (Exception ex){
            System.out.println("not a digit");
        }
    }
}
