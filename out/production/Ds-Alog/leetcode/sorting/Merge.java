import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int[] numbers = { 12, 12, 12, 12, 12 };
        merge(numbers);
        for (int i : numbers) {
            System.out.println(i);
        }

    }

    public static void merge(int[] numbers) {
        if (numbers.length <= 1) {
            return;
        }

        int mid = numbers.length / 2;

        int[] arrayLeft = Arrays.copyOfRange(numbers, 0, mid);
        int[] arrayRight = Arrays.copyOfRange(numbers, mid, numbers.length);

        merge(arrayLeft);
        merge(arrayRight);
        sort(arrayLeft, arrayRight, numbers);

    }

    public static void sort(int[] left, int[] right, int[] array) {

        int l = 0;
        int r = 0;
        int a = 0;

        while (l < left.length && r < right.length) {

            if (left[l] <= right[r]) {
                array[a] = left[l];
                l++;
            } else {
                array[a] = right[r];
                r++;
            }
            a++;

        }

        while (l < left.length) {
            array[a] = left[l];
            l++;
            a++;

        }

        while (r < right.length) {
            array[a] = right[r];
            r++;
            a++;

        }

    }

}
