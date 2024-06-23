public class spanArray {

    static int SpanArray(int a[]) {
        int max = a[0];
        int min = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        return max - min;
    }

    public static void main(String[] args) {
        int a[] = { 10, 20, 30, 40, 50, 60, 70 };
        System.out.println("Span of the Array is " + SpanArray(a));
    }
}
