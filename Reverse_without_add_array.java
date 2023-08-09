package Arrays.GFG_questions;

import java.util.Scanner;

public class Reverse_without_add_array {
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


        int p = arr.length - 1;
        for (int i = 0; i <= arr.length / 2; i++) {         // ek array ko half m devide kar k waha tak chalunga phr
            int temp = 0;                                   // aur aakhri wale element to suru wale s replace kr dunga
            temp =  arr[ i];                                // ek side s same s badhte rahega aur ek side s piche s kam hote rehega
            arr[i]  = arr[p];
            arr[p] = temp;
            p--;
        }

        System.out.println("\n the reverse of an array is:");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print("\t " +arr[i]);
        }
    }
}
