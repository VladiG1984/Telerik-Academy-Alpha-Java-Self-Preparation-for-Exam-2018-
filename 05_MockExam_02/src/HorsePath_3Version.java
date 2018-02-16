import java.util.Scanner;

public class HorsePath_3Version {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        //int[] row = new int[num];
        //int[] col = new int[num];
        int[] arrayInt = new int[num * num];

        arrayInt[0] = 1;
        int position = 0;

        for (int increment = 2; increment <= num * num; increment++) {

            int move1 = - 2 * num - 1;
            int move2 = - 2 * num + 1;
            int move3 = - num - 2;
            int move4 = - num + 2;
            int move5 = num - 2;
            int move6 = num + 2;
            int move7 = 2 * num - 1;
            int move8 = 2 * num + 1;

            int bestMove = 0;

            int r = position / num;
            int c = position % num;
            //System.out.println("position (old): " + position + " r: " + r + " c: " + c);

            // moves
            if (((r - 2) >= 0) && ((r - 2) < num) && ((c - 1) >= 0) && ((c - 1) < num) && arrayInt[move1 + position] == 0) {
                bestMove = move1;
            } else if (((r - 2) >= 0) && ((r - 2) < num) && ((c + 1) >= 0) && ((c + 1) < num) && arrayInt[move2 + position] == 0) {
                bestMove = move2;
            } else if (((r - 1) >= 0) && ((r - 1) < num) && ((c - 2) >= 0) && ((c - 2) < num) && arrayInt[move3 + position] == 0) {
                bestMove = move3;
            } else if (((r - 1) >= 0) && ((r - 1) < num) && ((c + 2) >= 0) && ((c + 2) < num) && arrayInt[move4 + position] == 0) {
                bestMove = move4;
            } else if (((r + 1) >= 0) && ((r + 1) < num) && ((c - 2) >= 0) && ((c - 2) < num) && arrayInt[move5 + position] == 0) {
                bestMove = move5;
            } else if (((r + 1) >= 0) && ((r + 1) < num) && ((c + 2) >= 0) && ((c + 2) < num) && arrayInt[move6 + position] == 0) {
                bestMove = move6;
            } else if (((r + 2) >= 0) && ((r + 2) < num) && ((c - 1) >= 0) && ((c - 1) < num) && arrayInt[move7 + position] == 0) {
                bestMove = move7;
            } else if (((r + 2) >= 0) && ((r + 2) < num) && ((c + 1) >= 0) && ((c +1) < num) && arrayInt[move8 + position] == 0) {
                bestMove = move8;
            } else {
                for (int j = 0; j < num * num; j++) {
                    if (arrayInt[j] == 0) {
                        bestMove = j - position;
                        break;
                    }
                }
            }
            //System.out.println("bestMove: " + bestMove);

            position += bestMove; //Math.min(number + 2, number - 2);
            arrayInt[position] = increment;
            //System.out.println("final position: " + position + " array new (final): " + (arrayInt[position]));
        }

        for (int i = 1; i <= num * num; i++) {
            System.out.print(arrayInt[i - 1] + " ");
            if (i % num == 0) {
                System.out.println();
            }
        }

    }
}
