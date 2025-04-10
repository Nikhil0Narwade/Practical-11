class Sudoku {
    String[][] layout;
    int size;

    void displayPattern(String[][] layout) {
        int size = layout.length;
        int m = 0;

        for (int ln = 0; ln < (2 * size) + 1; ln++) {
            int column = 0;

            if (ln % 2 == 0) {
                for (int x = 0; x < size; x++) {
                    System.out.print(" --");
                }
            } else {
                while (column < size) {
                    int row = ln - (m + 1);
                    String entry = layout[row][column].equals(" ")
                            ? String.format("%2s", layout[row][column])
                            : String.format("%2d", Integer.parseInt(layout[row][column]));

                    System.out.print("|" + entry);
                    column++;
                }
                m++;
            }

            System.out.println(ln % 2 == 0 ? "" : "|");
        }
    }

    Sudoku(int size) {
        String[][] layout = new String[size][size];

        for (int row = 0; row < size; row++) {
            int column = row + 1;
            for (int x = 0; x < size; x++) {
                if (column > size) column = 1;
                layout[row][x] = String.valueOf(column);
                column++;
            }
        }

        for (int i = 1; i <= (size * size) / 3; i++) {
            int randRow = (int) (System.nanoTime() % size);
            int randColumn = (int) (System.nanoTime() % size);
        }

        displayPattern(layout);
    }

    public static void main(String[] args) {
        Sudoku puzzle = new Sudoku(3);
    }
}