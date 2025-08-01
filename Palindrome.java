public class Palindrome {
    public static int reversNumber(int n) {
        int rev = 0;
        while(n > 0){
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int n = 121;
        int reverseN = reversNumber(n);
        System.out.println("Reverse of n = " + reverseN);

        // Checking if n is same
        // as reverse of n
        if (n == reverseN)
            System.out.println("Palindrome = Yes");
        else
            System.out.println("Palindrome = No");
    }
}