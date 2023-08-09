package Arrays;

public class Rotate_By_1 {
    public static void main(String[] args) {
        int arr[] = {4,6,7,1,255,32,17,789};
        int a = arr.length - 1;
        int temp = arr[arr.length - 1];


        for (int i = arr.length - 2; i >= 0; i--) {
            arr[a] = arr[i];
            a--;
        }
        arr[0]=temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
