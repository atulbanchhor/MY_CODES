package Recurssion;

public class sum_of_digit {
    public static void main(String[] args) {
        System.out.println(sum(12541));
    }

    static int sum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return sum(n / 10) + n % 10;
        }
    }
}
