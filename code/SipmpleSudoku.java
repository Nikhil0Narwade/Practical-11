import java.util.Random;
import java.util.Scanner;

class SimpleSudoku {
    String[][] layout;
    int size;
    int[] rowEmpty, columnEmpty, solutionArray, userArray;

    // Method to display the Sudoku puzzle
    void displayPuzzle() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(layout[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to handle user input and check solution
    void solvePuzzle() {
        Scanner sc = new Scanner(System.in);
        int incorrectEntries = 0;

        // Ask the user to fill in the empty cells
        for (int i = 0; i < (size * size) / 3; i++) {
            System.out.println("Enter value for cell (" + rowEmpty[i] + ", " + columnEmpty[i] + "): ");
            int userInput = sc.nextInt();
            userArray[i] = userInput;
            layout[rowEmpty[i] - 1][columnEmpty[i] - 1] = Integer.toString(userInput);

            // Check if the entered value is correct
            if (solutionArray[i] != userInput) {
                incorrectEntries++;
            }
        }

        if (incorrectEntries > 0) {
            System.out.println("Incorrect solution. " + incorrectEntries + " entries are wrong.");
        } else {
            System.out.println("Congrats! You solved the puzzle correctly.");
        }
        sc.close();
    }

    // Constructor to initialize the Sudoku grid and randomly remove cells
    SimpleSudoku(int size) {
        this.size = size;
        this.layout = new String[size][size];

        int numEmptyCells = (size * size) / 3;
        this.rowEmpty = new int[numEmptyCells];
        this.columnEmpty = new int[numEmptyCells];
        this.solutionArray = new int[numEmptyCells];
        this.userArray = new int[numEmptyCells];

        // Fill the Sudoku grid with numbers
        int num = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                layout[i][j] = Integer.toString(num);
                num++;
                if (num > size) num = 1;
            }
        }

        // Randomly remove cells and store their original values for checking
        Random random = new Random();
        for (int i = 0; i < numEmptyCells; i++) {
            int randRow = random.nextInt(size);
            int randColumn = random.nextInt(size);
            if (layout[randRow][randColumn].equals(" ")) {
                i--;
            } else {
                solutionArray[i] = Integer.parseInt(layout[randRow][randColumn]);
                layout[randRow][randColumn] = " "; // Set the cell as empty
                rowEmpty[i] = randRow + 1;
                columnEmpty[i] = randColumn + 1;
            }
        }

        displayPuzzle(); // Display the puzzle before solving
        solvePuzzle(); // Let the user solve the puzzle
    }

    // Main method to run the Sudoku game
    public static void main(String[] args) {
        int size = 4; // Default size for simplicity
        if (args.length > 0) {
            size = Integer.parseInt(args[0]); // Use command-line argument for size
        }
        new SimpleSudoku(size); // Just create a new instance, no need to assign to a variable
    }
}
