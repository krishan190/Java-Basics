public class binarySearch {

    public static int BinarySearch(int arr[], int data) {
        int start = 0;
        int end = arr.length - 1;

        // comparisons

        while (start <= end) {
            int mid = (start + end) / 2;
            if (data == arr[mid]) {
                return mid;
            }
            if (data < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 11, 22, 33, 44, 55, 66, 77, 88 };
        int data = 10;

        System.out.println("index for data is " + BinarySearch(arr, data));
    }
}
