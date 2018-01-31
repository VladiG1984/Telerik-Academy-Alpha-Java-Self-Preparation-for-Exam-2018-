import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float number1 = Float.parseFloat(scanner.nextLine());
        float number2 = Float.parseFloat(scanner.nextLine());
        float number3 = Float.parseFloat(scanner.nextLine());

        if (number1 == 0 || number2 == 0 || number3 == 0) {
            System.out.println("0");
        } else if (number1 < 0 && number2 < 0 && number3 < 0) {
            System.out.println("-");
        } else if (number1 < 0) {
            if (number2 > 0 && number3 > 0) {
                System.out.println("-");
            }
            else {
                System.out.println("+");
            }
        } else if (number2 < 0) {
            if (number1 > 0 && number3 > 0) {
                System.out.println("-");
            }
            else {
                System.out.println("+");
            }
        } else if (number3 < 0) {
            if (number1 > 0 && number2 > 0) {
                System.out.println("-");
            }
            else {
                System.out.println("+");
            }
        } else {
            System.out.println("+");
        }
    }
}
