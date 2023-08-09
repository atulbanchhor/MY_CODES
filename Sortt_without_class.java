package Arrays.GFG_questions;

public class Sortt_without_class {
    public static void main(String[] args) {
        int arr[] = {41, 55, 7, 40, 2, 6, 1, 4};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {       //  first element ko pakad k uske 1 aage wale element s check kar ra hu ye aakhri tak chalega
                int temp = 0;                                // aur agar jis element ko pakda hu vo uske aage chane wale element s bada hua to replace.
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
