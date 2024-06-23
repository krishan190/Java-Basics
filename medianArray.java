// Median of the given array 

// input:{ 2, 5, 1, 7 }
// output; 3.5

// Approach the problem
// first should be the array is sorted.
// first take the array take a length of the array.
// check if the array have odd length in that case simply return the mid element of the median of the array
// if the array has even length in that case:
//  (arr[idx] + arr[idx-1])/2; 

import java.util.Arrays;

class medianArray {

    static void getMedian(int arr[]) {
        Arrays.sort(arr);

        if (arr.length % 2 != 0) {
            int idx = arr.length / 2;
            System.out.println("Median of Arrays " + arr[idx]);
        } else {
            int idx = arr.length / 2;
            double md = (double) (arr[idx] + arr[idx - 1]) / 2;
            System.out.println("Median of Arrays " + md);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 7 };

        getMedian(arr);

    }
}