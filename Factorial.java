package Recurssion;

public class Factorial {
    public static void main(String[] args) {
       int n =  fact(5);
        System.out.println(n);
    }

    static int  fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
}
