package Recurssion;

public class Sum_natural {
    public static void main(String[] args) {
        int n = fun(5);
        System.out.println(n);
    }

   static int fun(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + fun(n - 1);
        }
    }
}
