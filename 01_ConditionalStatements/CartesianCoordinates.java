import java.util.Scanner;

public class CartesianCoordinates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        int result = 0;

        if (x == 0 && y == 0) {
            result = 0;
        } else if (x > 0 && y > 0) {
            result = 1;
        } else if (x < 0 && y > 0) {
            result = 2;
        } else if (x < 0 && y < 0) {
            result = 3;
        } else if (x > 0 && y < 0) {
            result = 4;
        } else if (x == 0 && y != 0) {
            result = 5;
        } else if (x != 0 && y == 0) {
            result = 6;
        }
        System.out.println(result);
    }
}
