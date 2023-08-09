package Recurssion;

public class palindrome {
    public static void main(String[] args) {
        String n = "abcbba";
        Boolean s3 = isPalindrome(n, n.charAt(0), n.length() - 1);
        System.out.println(s3);
    }

    static Boolean isPalindrome(String n, int start, int end) {
        if (n.length() == 1) {
            return true;
        } else {
            if (start >= end) {
                return true;
            } else {
                return (n.charAt(start) == n.charAt(end)) && isPalindrome(n, start + 1, end - 1);
            }
        }
    }
}