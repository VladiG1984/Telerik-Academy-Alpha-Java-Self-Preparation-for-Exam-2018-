import java.util.Scanner;

public class Speeds_2Version {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCars = Integer.parseInt(scanner.nextLine());

        int carsInGroup = 0;
        int totalSpeedInGroup = 0;
        int maxCarsInGroup = 0;
        int maxSumSpeed = 0;
        int minSpeed = 0;

        for (int i = 0; i < numberCars; i++) {

            int speed = Integer.parseInt(scanner.nextLine());

            if (speed > minSpeed) {

                carsInGroup++;
                totalSpeedInGroup += speed;

                if (carsInGroup > maxCarsInGroup) {
                    maxCarsInGroup = carsInGroup;
                    maxSumSpeed = totalSpeedInGroup;
                } else if (carsInGroup == maxCarsInGroup) {
                    if (totalSpeedInGroup > maxSumSpeed) {
                        maxSumSpeed = totalSpeedInGroup;
                    }
                }

            } else {
                carsInGroup = 1;
                totalSpeedInGroup = speed;
            }

            if (minSpeed > speed || minSpeed == 0) {
                minSpeed = speed;
            }
        }
        System.out.println(maxSumSpeed);
    }
}
