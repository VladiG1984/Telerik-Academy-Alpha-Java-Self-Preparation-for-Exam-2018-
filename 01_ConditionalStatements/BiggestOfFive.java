import java.util.Scanner;
import java.text.DecimalFormat;

public class BiggestOfFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double oldNumber = -200;

        for (int i = 0; i < 5; i++) {

            double number = Double.parseDouble(scanner.nextLine());

            if (number > oldNumber) {
                oldNumber = number;
            }
        }

        DecimalFormat format = new DecimalFormat("###.###############");

        System.out.println(format.format(oldNumber));


    }
}
