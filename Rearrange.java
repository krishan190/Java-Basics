// Rearrange array in increasing-decreasing order

import java.util.Arrays;

public class Rearrange {

    public static void main(String[] args) {
        int arr[] = { 1, 5, 4, 7, 9, 10 };
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n / 2; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int j = n - 1; j >= n / 2; j--) {
            System.out.print(arr[j] + " ");
        }
    }
}