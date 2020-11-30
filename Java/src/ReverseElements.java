public class ReverseElements {
    public static void main(String[] args) {
        int[] arrayA = {4, 6, 9, 3, 4, 7, 3, 32, 6, 6, 4, 2};
        int N = arrayA.length;
        for (int i = 0; i < N / 2; i++) {
            int temp = arrayA[i];
            arrayA[i] = arrayA[N - 1 - i];
            arrayA[N - 1 - i] = temp;
        }

    }
}
