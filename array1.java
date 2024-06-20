class array1 {
    int arr[] = { 33, 22, 21, 26, 77, 88 };

    int largest() {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    int smallest() {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String args[]) {
        array1 arr = new array1();
        System.out.println("largest value in given array " + arr.largest());
        System.out.println("largest value in given array " + arr.smallest());
    }
}