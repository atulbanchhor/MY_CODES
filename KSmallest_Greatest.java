package Arrays.GFG_questions;

import java.util.Scanner;

public class KSmallest_Greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of an array");
        int arr[] = new int[sc.nextInt()];
        System.out.println("enter the element of an array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("your array are :");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print("\t " + arr[i]);
        }
        System.out.println();



        int small = arr[0];                         // in which i take any element as smallest
        for (int i = 0; i < arr.length; i++) {      // then check smallest no. to every element of an array
            if (small > arr[i]){                    // while checking with every element if any element is smaller than the alloted number is replaced with it
                small = arr[i];
            }
        }
        System.out.println("the smallest kth element is the array is : " + small);

        int greatest = arr[0];
        for (int i = 0; i < arr.length; i++) {          // as usual with smallest element same as in the greatest number of the element
            if (greatest < arr[i])
                greatest = arr[i];
        }
        System.out.println("the greatest kth element is the array is : " + greatest);

    }
}
