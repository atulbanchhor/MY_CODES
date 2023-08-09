package Arrays;

public class kth_smallest {
    public static void main(String[] args) {
        int arr[] = {4, 2, 6, 5, 77, 1, 55, 56, 48};
        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        System.out.println(smallest);
    }
}
