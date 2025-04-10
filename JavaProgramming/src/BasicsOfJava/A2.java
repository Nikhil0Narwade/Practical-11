package BasicsOfJava;

public class A2 {

    public static void main(String[] args) {


        String a = "amma";

        if (isPalindrome(a)) {

            System.out.println(a + " is palondrome ");
        } else {
            System.out.println(a + " is not palindrome ");
        }
    }

    static boolean isPalindrome(String b){

        StringBuilder str = new StringBuilder(b);
        str.reverse();
        return b.equals(str.toString());


    }
}
