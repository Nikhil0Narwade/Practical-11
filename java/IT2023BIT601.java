public class IT2023BIT601 {

    public static StringBuilder digitSum(int number) {
        if (number == 0) {
            return new StringBuilder("0=0");
        }

        if (number < 10) {
            return new StringBuilder(number + "=" + number);
        }

        int lastDigit = number % 10;
        StringBuilder result = digitSum(number / 10);
        
        result.insert(result.lastIndexOf("="), "+" + lastDigit);
        
        int totalSum = Integer.parseInt(result.substring(result.lastIndexOf("=") + 1)) + lastDigit;
        
        result.setLength(result.lastIndexOf("=") + 1);
        result.append(totalSum);

        return result;
    }

    public static StringBuilder checkPalindrome(String input) {
        StringBuilder sb = new StringBuilder();
        
        if (input.length() <= 1) {
            sb.append(input).append(" is a palindrome.");
            return sb;
        }

        if (input.charAt(0) != input.charAt(input.length() - 1)) {
            sb.append(input).append(" is not a palindrome because the characters at positions 0 and ")
              .append(input.length() - 1).append(" don't match.");
            return sb;
        }

        StringBuilder innerResult = checkPalindrome(input.substring(1, input.length() - 1));

        if (innerResult.toString().contains("not a palindrome")) {
            sb.append(innerResult.toString()); // Appending the original mismatch message
            return sb;
        }

        sb.append(input).append(" is a palindrome.");
        return sb;
    }

    public static int countPalindromeSubstrings(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        int totalCount = 0;
        
        for (int i = 0; i < input.length(); i++) {
            totalCount += findPalindromes(input, i, i);
            totalCount += findPalindromes(input, i, i + 1);
        }
        
        return totalCount;
    }

    private static int findPalindromes(String str, int left, int right) {
        if (left < 0 || right >= str.length() || str.charAt(left) != str.charAt(right)) {
            return 0;
        }

        return 1 + findPalindromes(str, left - 1, right + 1);
    }

    public static void main(String[] args) {
        System.out.println(digitSum(456));
        System.out.println(digitSum(9));
        System.out.println(digitSum(1));

        System.out.println(checkPalindrome("45654"));
        System.out.println(checkPalindrome("45634"));
        System.out.println(checkPalindrome("454"));
        System.out.println(countPalindromeSubstrings("ababa"));
    }
}
