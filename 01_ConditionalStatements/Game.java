import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int c = number % 10;
        int b = (number % 100 - number % 10) / 10;
        int a = (number % 1000 - number % 100) / 100;

        //System.out.println(a + " " + b + " " + c);

        int multiplyAll = a * b * c;
        int multiplyAdd1 = a * b + c;
        int multiplyAdd2 = a + b * c;
        int addAll = a + b + c;

        int maxNumber = Math.max(Math.max(Math.max(multiplyAll, multiplyAdd1), multiplyAdd2), addAll);

        System.out.println(maxNumber);
    }
}
