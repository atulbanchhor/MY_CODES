package ALgorithms;

import java.util.Scanner;

public class Linear_Search {
   static Scanner sc  = new Scanner(System.in);
    public static void main(String[] args) {
        int arr[]= {21,25,13,1,0,21,52,435,78};
        System.out.println("enter the search keyword");
        int n = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]== n){
                System.out.println("the " + n + " is find at the place of " + i);
            }
        }
    }
}
