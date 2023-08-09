package Recurssion;

public class practice_Part2 {
    public static void main(String[] args) {
//        System.out.println(fun(16));
        System.out.println("for the function 1 👇👇");
        fun1(7);
    }

    static void fun1(int n ){

        if (n==0){
            return;
        }else {
            fun1(n/2);
            System.out.println(n%2);
        }
    }

    static int fun(int n) {
        if (n == 1) {
            return 0;
        } else {
            return 1 + fun(n / 2);
        }
    }
}
