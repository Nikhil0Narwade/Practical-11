package BasicsOfJava;

 class aA1{

    public static void main(String[] args) {
        // Corrected the syntax error by fixing the closing parenthesis
        System.out.println(getDigits(142));
    }

    static int getDigits(int number) {
        int a = number + 1; // Add 1 to the number
        return a; // Return the updated number
    }
}
