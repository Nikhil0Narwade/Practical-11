package BasicsOfJava;

class IT2023bit601 {
    public static void main(String[] args) {

        String input = "1234";
        String reversed = reverse(input);
        System.out.println("Reversed: " + reversed);

        System.out.println(sumOfDigits(123));

        System.out.println(isPalindrome("12"));
        System.out.println(isPalindrome("11"));
    }


    // Implement the solution for Task 1
    public static String reverse(String inputString) {
        // Task 1 implementation here
        if (inputString == null || inputString.length() <= 1) {
            return inputString;
        }
        return reverse(inputString.substring(1)) + inputString.charAt(0);
    }

    // Implement the solution for Task 2
    public static int sumOfDigits(int number) {
        // Task 2 implementation here
        if (number == 0) {
            return 0;

        }


        return (number % 10) + sumOfDigits(number / 10);
    }


    // Implement the solution for Task 3
    public static boolean isPalindrome(String inputString) {

        // Task 3 implementation here
        if (inputString.length() <= 1) {
            return true;
        }


        if (inputString.charAt(0) != inputString.charAt(inputString.length() - 1)) {
            return false;
        }


        return isPalindrome(inputString.substring(1, inputString.length() -1));
    }
}
