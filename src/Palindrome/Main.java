package Palindrome;

public class Main {
    public static void main(String[] args) {
        palindrome("sdfsdfsdff");
        //palindrome("madammadam");
    }

    public static boolean palindrome(String A) {
        String reverse = new StringBuilder(A).reverse().toString();
        for (int i = 0; i < A.length(); i++) {
            char ch1 = A.charAt(i);
            char ch2 = reverse.charAt(i);
            if (ch1 != ch2) {
                System.out.println("No");
                return false;
            }
        }
        System.out.println("Yes");
        return true;
    }
}
