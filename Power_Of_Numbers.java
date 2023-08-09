package Recurssion;

import java.util.Scanner;

public class Power_Of_Numbers {
    static int rev;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m1 = n;
        int len = (int) (Math.log10(n) + 1);

        while (n > 0) {
            int m = n % 10;
            n = n / 10;
            rev = rev * 10 + m;
        }
        double ans = power(m1, rev);
        System.out.println(ans);
    }

    static double power(int n, int rev) {
        if (rev == 0) {
            return 1;
        }
        else {
           return (n * power(n, rev - 1));
        }
    }
}
