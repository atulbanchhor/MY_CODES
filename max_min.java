package Arrays.GFG_questions;

public class max_min {
    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 74, 21, 4, 166, 222, 646};


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {          //  first element ko pakad k uske 1 aage wale element s check kar ra hu ye aakhri tak chalega
                int temp = 0;                                  // aur agar jis element ko pakda hu vo uske aage chane wale element s bada hua to replace.

                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("The maximum of the array is " + arr[0]);
        System.out.println("The minumum of the array is " + arr[arr.length - 1]);
    }
}
