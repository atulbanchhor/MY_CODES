package Arrays.GFG_questions;

import java.util.Scanner;

//Find a peak element which is not smaller than its neighbours

public class pick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of an array");
        int arr[] = new int[sc.nextInt()];
        System.out.println("enter the element of an array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("your array are :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t " + arr[i]);
        }
        System.out.println();


        System.out.println("the elements are which is greater than its neighbour");
        for (int i = 1; i <= arr.length - 2; i++) {                                     // element ko 1 s start kia hu aur end second last m kara hu kuki ek aage aur ek piche check krna hai
            if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {                          // element apne ek aage aur apne ek piche check kar ra hai
                System.out.println(arr[i]);
            }
        }

    }
}
