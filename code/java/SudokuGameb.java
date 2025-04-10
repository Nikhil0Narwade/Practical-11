import java.util.Random;
import java.util.Scanner;

class SudokuGame {
    String[][] board;

     int gridSize, errorCount;

        int[] emptyRows, emptyCols;

    int[] correctValues, userInputs;

        void renderGrid(String[][] board)
         {

    int width = Integer.toString(gridSize).length();
        int rowMarker = 0;
     for (int row = 0; row < (2 * gridSize) + 1; row++) 
     {
                int col = 0;

            if (row % 2 == 0)
             {
                    for (int colMark = 0; colMark < gridSize; colMark++)
                     {

                        System.out.print(" ");
                    for (int dash = 0; dash < width; dash++) 
                    {
                        System.out.print("-");
                    }
                }
            } 
            else 
            {
                while (col < gridSize) 
                {
                    int actualRow = row - (rowMarker + 1);
                    String value;

                        if (board[actualRow][col].equals(" ")) 
                    {
                         value = String.format("%" + width + "s", board[actualRow][col]);
                    }
                     else
                      {
                        value = String.format("%" + width + "d", Integer.parseInt(board[actualRow][col]));
                    }
                   
                    System.out.print("|");
                    
                    System.out.print(value);
                      col++;
                }
                rowMarker++;
            }

            if (row % 2 == 0)
             {
                    System.out.println();
            } else 
            {
                    System.out.println("|");
            }
        }
    }

    void checkSolution(int[] emptyRows, int[] emptyCols) 
    {
        Scanner inputScanner = new Scanner(System.in);

        for (int i = 0; i < (gridSize * gridSize) / 3; i++)
         {
            System.out.println("Enter a number for position: [" + emptyRows[i] + "][" + emptyCols[i] + "]");
            userInputs[i] = inputScanner.nextInt();

                board[emptyRows[i] - 1][emptyCols[i] - 1] = String.valueOf(userInputs[i]);

            if (correctValues[i] != userInputs[i]) errorCount++;
        }

        inputScanner.close();

        if (errorCount > 0)
         {
            System.out.println("Incorrect solution.");
          
            System.out.println("Hint: " + errorCount + " entries are wrong.");
        } 
        else
         {
                System.out.println("Correct! You solved the puzzle.");
        }

    }

    SudokuGame(int size) 
    
    {
        this.board = new String[size][size];
        this.gridSize = size;
        this.errorCount = 0;

        int emptyCells = (size * size) / 3;
        this.emptyRows = new int[emptyCells];
        this.emptyCols = new int[emptyCells];

        this.correctValues = new int[emptyCells];
        this.userInputs = new int[emptyCells];

        int value = 1;
        for (int i = 0; i < size; i++) 
        {
            for (int j = 0; j < size; j++) 
            {
                board[i][j] = Integer.toString(value);
                value++;
                if (value > size) value = 1;
            }
        }

        Random randomizer = new Random();
        for (int i = 0; i < emptyCells; i++)
         {
            int randomRow = randomizer.nextInt(size);
            int randomCol = randomizer.nextInt(size);
            if (board[randomRow][randomCol].equals(" ")) {
                i--;
            } else 
            {
                correctValues[i] = Integer.parseInt(board[randomRow][randomCol]);
                board[randomRow][randomCol] = " ";
                emptyRows[i] = randomRow + 1;
                emptyCols[i] = randomCol + 1;
            }
        }

        renderGrid(board);
        checkSolution(emptyRows, emptyCols);
    }

    public static void main(String[] args) 
    {
        int gridSize = 5;
        if (args.length > 0) {
            gridSize = Integer.parseInt(args[0]);
        }
        new SudokuGame(gridSize);
    }
}
