class IT2023BIT601 {

    public static StringBuilder sumOfDigits(int number)
    {
        if (number == 0)
        {
            return new StringBuilder("0=0");
        }
        if (number / 10 == 0)
        {
            return new StringBuilder(number + "=" + number);
        }

        int lastDigit = number % 10;

         StringBuilder sb = sumOfDigits(number / 10);

        sb.insert(sb.lastIndexOf("="), "+" + lastDigit);
        int sum;

        if (number / 10 == 0)
        {
            sum = lastDigit;
        }
        else
        {
            sum = Integer.parseInt(sb.substring(sb.lastIndexOf("=") + 1)) + lastDigit;
        }
            sb.setLength(sb.lastIndexOf("=") + 1);
        sb.append(sum);

        return sb;
    }

    public static StringBuilder isPalindrome(String inputString)
    {
        StringBuilder sb = new StringBuilder();

        if (inputString.length() <= 1)
        {
            sb.append(inputString)
                        .append(" is a palindrome number.");
            return sb;
        }

        if (inputString.charAt(0) != inputString.charAt(inputString.length() - 1))
        {
            sb.append(inputString)
                     .append(" is not a palindrome number because digit at position ")
                          .append(0).append(" isn't matching digit at position ")
                    .append(inputString.length() - 1);

            return sb;

        }

             StringBuilder result = isPalindrome(inputString.substring(1, inputString.length() - 1));

        if (result.toString().contains("is not a palindrome number"))
        {
            int mismatchIndex = Integer.parseInt(result.substring(result.indexOf("position") + 8, result.indexOf("isn't")).trim()) + 1;
            sb.append(inputString)

                    .append(" is not a palindrome number because digit at position ")

                    .append(mismatchIndex).append(" isn't matching digit at position ")

                    .append(inputString.length() - mismatchIndex - 1);

            return sb;
        }

        sb.append(inputString)
                .append(" is a palindrome number.");
        return sb;
    }

    public static int getCountOfAllPalindromeSubstrings(String inputString)
    {
        if (inputString == null || inputString.isEmpty())
        {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < inputString.length(); i++)
        {
            count += countPalindromes(inputString, i, i);
            count += countPalindromes(inputString, i, i + 1);
        }
        return count+1;
    }

    private static int countPalindromes(String s, int left, int right)
    {
        if (left < 0 || right >= s.length() || s.charAt(left) != s.charAt(right))
        {
            return 0;
        }
        return 1 + countPalindromes(s, left - 1, right + 1);
    }

    public static void main(String[] args)
    {
        System.out.println(sumOfDigits(456));
        System.out.println(sumOfDigits(9));
        System.out.println(sumOfDigits(1));

        System.out.println(isPalindrome("45654"));
        System.out.println(isPalindrome("45634"));
        System.out.println(isPalindrome("454"));
        System.out.println(getCountOfAllPalindromeSubstrings("aczab"));

    }
}

