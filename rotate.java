public class rotate {

    static void Rotate(int arr[], int d, int n) {

        // storing rotated version of the array
        int temp[] = new int[n];
        int k = 0;

        // storing n-d elements in temp
        for (int i = d; i < n; i++) {
            temp[k] = arr[i];
            k++;
        }

        // remaining elements add in rear end
        for (int i = 0; i < d; i++) {
            temp[k] = arr[i];
            k++;
        }

        // copying the element in temp to arr
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int N = arr.length;
        int d = 3;

        Rotate(arr, d, N);
        printArray(arr, N);
    }
}
