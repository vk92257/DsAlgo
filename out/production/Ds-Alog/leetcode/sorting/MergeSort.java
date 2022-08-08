import java.util.Arrays;

class MergeSort {

    public static void main(String[] args) {
        int[] input = { 1, 4, 5, 7, 3, 3 };

        // int startIndex = 0;
        // int endIndex = input.length;
        // int mid = endIndex / 2;

        // int[] leftArray = Arrays.copyOfRange(input, 0, mid);
        // int[] rightArray = Arrays.copyOfRange(input, mid, endIndex);

        // for (int j : leftArray) {
        // System.out.println("left ARrray ->>>>>>> " + j);
        // }

        // for (int l : rightArray) {
        // System.out.println("Right ARrray ->>>>>>> " + l);
        // }

        mergeSort(input);

    }

    private static void mergeSort(int[] input) {
        if (input.length <= 1) {
            return;
        }

        int mid = input.length / 2;

        int[] leftArray = Arrays.copyOfRange(input, 0, mid);
        int[] rightArray = Arrays.copyOfRange(input, mid, input.length);

        /*
         * for (int j : leftArray) {
         * System.out.println(mid + "  = left ARrray  ->>>>>>> " + j);
         * }
         * 
         * for (int l : rightArray) {
         * System.out.println(mid + "   = Right ARrray  ->>>>>>> " + l);
         * }
         * for (int l : rightArray) {
         * System.out.println(mid + "   = Right ARrray  ->>>>>>> " + l);
         * }
         */

        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(input, leftArray, rightArray);

    }

    private static void merge(int[] input, int[] l, int[] r) {

        int left = 0;
        int right = 0;
        int out = 0;

        while (left < l.length && right < r.length) {
            if (l[left] <= r[left]) {
                input[out] = r[left];
                left++;
            } else {
                input[out] = l[right];
                right++;
            }
            out++;
        }

        while (left < l.length) {
            input[out] = l[left];
            left++;
            out++;
        }

        while (right < r.length) {
            input[out] = r[right];
            right++;
            out++;
        }

        for (int i : input) {
            System.out.print("-> " + i);
        }

    }
}