package BasicsOfJava;

public class A1{
    public static void main(String[] args) {
        int number = 142;
        // Call getSum method with the number
        String result = getSum(number);
        // Print the result in the required format
        System.out.println(result);
    }

    // Method to calculate the sum of digits and return it in the required format
    static String getSum(int number) {
        int sum = 0;
        StringBuilder digits = new StringBuilder();  // To store digits for the output format

        // Process each digit of the number
        int originalNumber = number; // Keep the original number to use for formatting

        // Loop to extract digits and build the formatted string
        while (number > 0) {
            int digit = number % 10;  // Extract the last digit
            sum += digit;  // Add the digit to sum
            digits.insert(0, digit);  // Add the digit to the front of the StringBuilder

            number /= 10;  // Remove the last digit

            if (number > 0) {
                digits.insert(1, "+");  // Add "+" between digits, but only between digits (not at the end)
            }
        }

        // Construct and return the final formatted string
        return digits.toString() + " = " + sum;
    }
}
