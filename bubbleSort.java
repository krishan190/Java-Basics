public class bubbleSort {
    public static void BubbleSort(int arr[], int n) {
        int flag, temp;
        for (int i = 0; i < n - 1; i++) {
            flag = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0)
                break;
        }
    }

    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1, 9, 8, 7 };
        int n = arr.length;

        BubbleSort(arr, n);
        printArray(arr, n);
    }
}
