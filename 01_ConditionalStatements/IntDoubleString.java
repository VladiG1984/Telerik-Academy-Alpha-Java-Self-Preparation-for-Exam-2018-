import java.util.Scanner;

public class IntDoubleString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine().toLowerCase();

        switch(type) {
            case "integer":
                int intNumber = Integer.parseInt(scanner.nextLine());
                if (intNumber >= -1000 && intNumber <= 1000) {
                    intNumber++;
                    System.out.println(intNumber);
                }
                break;
            case "real":
                double doubleNumber = Double.parseDouble(scanner.nextLine());
                if (doubleNumber >= -1000 && doubleNumber <= 1000) {
                    doubleNumber++;
                    System.out.printf("%.2f", doubleNumber);
                }
                break;
            case "text":
                String stringNumber = scanner.nextLine();
                stringNumber += "*";
                System.out.println(stringNumber);
                break;
        }
    }
}
