package Recurssion;

public class fibonachiiii {
    public static void main(String[] args) {
        int f = fibo(5);
        System.out.println(f);
    }

    static int fibo(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}