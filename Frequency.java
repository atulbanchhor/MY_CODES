package Arrays;

import java.util.Arrays;

public class Frequency {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 3, 3, 2, 1, 2, 3, 2, 1, 2};

        boolean freq[] = new boolean[arr.length];
        Arrays.fill(freq, false);

        for (int i = 0; i < arr.length; i++) {
            if (freq[i] == true) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    freq[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " frequency is "+ count);
        }
    }
}
