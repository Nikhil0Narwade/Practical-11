import java.util.Random;
import java.util.Scanner;

class Newsudoku {
    String[][] layout;
    int size, flag;
    int[] rowEmpty, columnEmpty;
    int[] solutionArray, userArray;

    void displayPattern(String[][] layout) {
        int digits = Integer.toString(size).length();
        int m = 0;
        for (int ln = 0; ln < (2 * size) + 1; ln++) {
            int column = 0;
            if (ln % 2 == 0) {
                for (int x = 1; x <= size; x++) {
                    System.out.print(" ");
                    for (int dash = 0; dash < digits; dash++) {
                        System.out.print("-");
                    }
                }
            } else {
                while (column < size) {
                    int row = ln - (m + 1);
                    String entry;
                    if (layout[row][column].equals(" ")) {
                        entry = String.format("%" + digits + "s", layout[row][column]);
                    } else {
                        entry = String.format("%" + digits + "d", Integer.parseInt(layout[row][column]));
                    }
                    System.out.print("|");
                    System.out.print(entry);
                    column++;
                }
                m++;
            }
            if (ln % 2 == 0) {
                System.out.println();
            } else {
                System.out.println("|");
            }
        }
    }

    void solution(int[] rowEmpty, int[] columnEmpty) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < (size * size) / 3; i++) {
            System.out.println("Enter value for : [" + rowEmpty[i] + "][" + columnEmpty[i] + "]");
            userArray[i] = sc.nextInt();
            layout[rowEmpty[i] - 1][columnEmpty[i] - 1] = String.valueOf(userArray[i]);
            if (solutionArray[i] != userArray[i]) flag++;
        }
        sc.close();

        if (flag > 0) {
            System.out.println("Incorrect Solution");
            System.out.println("Hint: " + flag + " entries are incorrect");
        } else {
            System.out.println("Congrats!! Correct Solution");
        }
    }

    Newsudoku(int size) {
        this.layout = new String[size][size];
        this.size = layout.length;
        this.flag = 0;
        int numEmptyCells = (size * size) / 3;
        this.rowEmpty = new int[numEmptyCells];
        this.columnEmpty = new int[numEmptyCells];
        this.solutionArray = new int[numEmptyCells];
        this.userArray = new int[numEmptyCells];

        for (int row = 0; row < size; row++) {
            int column = row + 1;
            for (int x = 0; x < size; x++) {
                if (column > size) column = 1;
                layout[row][x] = Integer.toString(column);
                column++;
            }
        }

        Random random = new Random();
        for (int i = 0; i < numEmptyCells; i++) {
            int randRow = random.nextInt(size);
            int randColumn = random.nextInt(size);
            if (layout[randRow][randColumn].equals(" ")) {
                i--;
            } else {
                solutionArray[i] = Integer.parseInt(layout[randRow][randColumn]);
                layout[randRow][randColumn] = " ";
                rowEmpty[i] = randRow + 1;
                columnEmpty[i] = randColumn + 1;
            }
        }

        displayPattern(layout);
        solution(rowEmpty, columnEmpty);
    }

    public static void main(String[] args) {
        int size = 9; // Default size
        if (args.length > 0) {
            size = Integer.parseInt(args[0]); // Use the first argument for size
        }
        Newsudoku puzzle = new Newsudoku(size);
    }
}
