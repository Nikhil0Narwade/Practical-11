package BasicsOfJava;

public class As2 {

    public static void main(String[] args) {
        displaygrid(3);
    }

    // Make this method static because you're calling it from a static method.
    static int[][] arr(int size) {
        int[][] arr = new int[size][size];

        // Initialize the first row
        for (int i = 0; i < size; i++) {
            arr[0][i] = i + 1;
        }

        // Fill the rest of the grid based on the logic you provided
        for (int i = 0; i < size; i++) {
            int sum = arr[0][i];
            for (int j = 0; j < size; j++) {
                sum += 1;
                if (sum > size) sum = 1;
                arr[j][i] = sum;
            }
        }
        return arr;
    }

    static String displaygrid(int size) {
        String s = "" + size;  // For calculating the width of the grid cells
        String str = "-".repeat(s.length());
        int width = str.length();
        String s1 = str;
        str += ".";
        str = str.repeat(size);
        str = "." + str + "\n";

        // Use string format to construct the grid with placeholders
        s = str.replace(".", "|");
        s = s.replace(s1, "%s");
        s += "\n";
        s = s + str;
        s = s.repeat(size);
        s = str + s;

        // Get the generated array
        int[][] arr = arr(size);
        int value = 1;

        // Loop through the grid and fill it with values
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                String s2 = "";
                if (value % 3 == 0) {
                    s2 += " ".repeat(width);
                } else {
                    s2 = "" + arr[i][j];
                    s2 = "0".repeat(width - s2.length()) + s2;
                }
                s = s.replaceFirst("%s", s2);
                value++;
            }
        }

        // Print the grid (or return it if needed)
        System.out.println(s);
        return s;
    }
}
