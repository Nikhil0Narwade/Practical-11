import java.util.Random;
import java.util.Scanner;

class SudokuGame {
    String[][] board;
    int gridSize, errorCount;
    int[] emptyRows, emptyCols;
    int[] correctValues, userInputs;

    // Method to print the Sudoku grid
    void renderGrid(String[][] board) {
        int width = Integer.toString(gridSize).length();
        int rowMarker = 0;
        for (int row = 0; row < (2 * gridSize) + 1; row++) {
            int col = 0;
            if (row % 2 == 0) {
                for (int colMark = 0; colMark < gridSize; colMark++) {
                    System.out.print(" ");
                    for (int dash = 0; dash < width; dash++) {
                        System.out.print("-");
                    }
                }
            } else {
                while (col < gridSize) {
                    int actualRow = row - (rowMarker + 1);
                    String value;
                    if (board[actualRow][col].equals(" ")) {
                        value = String.format("%" + width + "s", board[actualRow][col]);
                    } else {
                        value = String.format("%" + width + "d", Integer.parseInt(board[actualRow][col]));
                    }
                    System.out.print("|");
                    System.out.print(value);
                    col++;
                }
                rowMarker++;
            }
            if (row % 2 == 0) {
                System.out.println();
            } else {
                System.out.println("|");
            }
        }
    }

    // Method to handle user input and verify correctness
    void checkSolution(int[] emptyRows, int[] emptyCols) {
        Scanner inputScanner = new Scanner(System.in);
        for (int i = 0; i < (gridSize * gridSize) / 3; i++) {
            System.out.println("Please enter a number for position: [" + emptyRows[i] + "][" + emptyCols[i] + "]");
            userInputs[i] = inputScanner.nextInt();
            board[emptyRows[i] - 1][emptyCols[i] - 1] = String.valueOf(userInputs[i]);
            if (correctValues[i] != userInputs[i]) errorCount++;
        }
        inputScanner.close();

        if (errorCount > 0) {
            System.out.println("The solution is incorrect.");
            System.out.println("Hint: " + errorCount + " entries are wrong.");
        } else {
            System.out.println("Excellent! You solved the puzzle correctly.");
        }
    }

    // Constructor to initialize the game
    SudokuGame(int size) {
        this.board = new String[size][size];
        this.gridSize = size;
        this.errorCount = 0;
        int emptyCells = (size * size) / 3;
        this.emptyRows = new int[emptyCells];
        this.emptyCols = new int[emptyCells];
        this.correctValues = new int[emptyCells];
        this.userInputs = new int[emptyCells];

        // Initialize the grid with numbers in a repeating pattern
        int value = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = Integer.toString(value);
                value++;
                if (value > size) value = 1;
            }
        }

        // Randomly set some cells to be empty and store their correct values
        Random randomizer = new Random();
        for (int i = 0; i < emptyCells; i++) {
            int randomRow = randomizer.nextInt(size);
            int randomCol = randomizer.nextInt(size);
            if (board[randomRow][randomCol].equals(" ")) {
                i--; // Retry if the spot is already empty
            } else {
                correctValues[i] = Integer.parseInt(board[randomRow][randomCol]);
                board[randomRow][randomCol] = " "; // Mark the cell as empty
                emptyRows[i] = randomRow + 1;
                emptyCols[i] = randomCol + 1;
            }
        }

        renderGrid(board); // Display the initial puzzle grid
        checkSolution(emptyRows, emptyCols); // Allow the user to attempt solving
    }

    // Main method to run the Sudoku game
    public static void main(String[] args) {
        int gridSize = 5; // Default to a 9x9 grid
        if (args.length > 0) {
            gridSize = Integer.parseInt(args[0]); // Use input argument for grid size
        }
        SudokuGame game = new SudokuGame(gridSize); // Start the game with the given grid size
        // The game object is now used, no further action is required
    }
    
    
}
