package Recurssion;

import static java.lang.Math.max;

public class staricase {
    public static void main(String[] args) {
        int sum = 0, count = 0;
        int ans=fun(3, sum, count);
        System.out.println(ans);
    }

    static int fun(int n, int sum, int count) {

        if(sum>n){
            return count;
        }
        if (n == sum) {
            return (++count);

        } else {
            return( (fun(n, sum + 1, count) + fun(n, sum + 2, count)));
        }
//        System.out.println(count);
    }
}
