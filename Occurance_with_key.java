package Arrays.GFG_questions;

import java.util.Scanner;

public class Occurance_with_key {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of an array");
        int arr[] = new int[sc.nextInt()];
        System.out.println("enter the element of an array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("your array are : ");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print("\t " + arr[i]);
        }

        System.out.println("\n enter the key which you want to find the occurance ");
        int key = sc.nextInt();
        int count = 0;                                                              // take the key form user and traverse in array if it match then count++
        for (int i = 0; i < arr.length ; i++) {
            if (key == arr[i]){
                count++;
            }
        }
        System.out.println("the occurance of " + key + " is " + count);

    }
}
