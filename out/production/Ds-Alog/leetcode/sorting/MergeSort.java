import java.util.Arrays;

class MergeSort {

    public static void main(String[] args) {
        int[] input = { 1, 4, 5, 7, 3, 3 };

        /*
         * int startIndex = 0;
         * int endIndex = /* input.length 0;
         * int mid = (endIndex + startIndex) / 2;
         * 
         * int[] leftArray = Arrays.copyOfRange(input, 0, mid);
         * int[] rightArray = Arrays.copyOfRange(input, mid, endIndex);
         * 
         * for (int j : leftArray) {
         * System.out.println("left ARrray  ->>>>>>> " + j);
         * }
         * 
         * for (int l : rightArray) {
         * System.out.println("Right ARrray  ->>>>>>> " + l);
         * }
         */

        mergeSort(input, 0, input.length);

    }

    private static void mergeSort(int[] input, int startIndex, int endIndex) {
        if (input.length == 1) {
            return;
        }

        int mid = (endIndex + startIndex) / 2;

        int[] leftArray = Arrays.copyOfRange(input, startIndex, mid);
        int[] rightArray = Arrays.copyOfRange(input, mid, endIndex);

        for (int j : leftArray) {
            System.out.println(mid + "  = left ARrray  ->>>>>>> " + j);
        }

        for (int l : rightArray) {
            System.out.println(mid + "   = Right ARrray  ->>>>>>> " + l);
        }

        mergeSort(leftArray, startIndex, mid);
        mergeSort(rightArray, mid, endIndex);

        merge(leftArray, rightArray);

    }

    private static void merge(int[] l, int[] r) {

        int sizeL = l.length;
        int sizeR = r.length;
        int[] output = new int[sizeL + sizeR];

        int left = 0;
        int right = 0;
        int out = 0;

        while (left < sizeL && right < sizeR) {
            if (l[left] < r[right]) {
                output[out] = r[right];
                right++;
            } else {
                output[out] = l[left];
                left++;
            }
            out++;
        }

        while (left < sizeL) {
            output[out] = l[left];
            left++;
            out++;
        }

        while (right < sizeR) {
            output[out] = r[right];
            right++;
            out++;
        }

        for (int i : output) {
            System.out.println("left ARrray  ->>>>>>> " + i);
        }

    }
}