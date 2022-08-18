import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        // int[] numbers = { 12, 12, 23, 4, 6, 6, 10, -35, 28 };
        int[] numbers = { 2, 2, 2, 1 };
        int[] highestNumbers = new int[2];
        for (int i = 0; i < highestNumbers.length; i++) {
            highestNumbers[i] = 0;
        }
        merge(numbers, highestNumbers);
        for (int i : numbers) {
            System.out.println(i);
        }

        for (int i : highestNumbers) {
            System.out.println("This is the code ->>>>> " + i);
        }

    }

    public static void merge(int[] numbers, int[] highestNumbers) {
        if (numbers.length <= 1) {
            return;
        }

        int mid = numbers.length / 2;

        int[] arrayLeft = Arrays.copyOfRange(numbers, 0, mid);
        int[] arrayRight = Arrays.copyOfRange(numbers, mid, numbers.length);

        merge(arrayLeft, highestNumbers);
        merge(arrayRight, highestNumbers);
        sort(arrayLeft, arrayRight, numbers, highestNumbers);

    }

    public static void sort(int[] left, int[] right, int[] array, int[] highestNumbers) {

        int l = 0;
        int r = 0;
        int a = 0;

        while (l < left.length && r < right.length) {

            if (left[l] <= right[r]) {
                array[a] = left[l];
                findHighest(highestNumbers, left[l]);
                l++;
            } else {
                array[a] = right[r];
                findHighest(highestNumbers, right[r]);
                r++;
            }
            a++;

        }

        while (l < left.length) {
            array[a] = left[l];
            findHighest(highestNumbers, left[l]);
            l++;
            a++;

        }

        while (r < right.length) {
            array[a] = right[r];
            findHighest(highestNumbers, right[r]);
            r++;
            a++;

        }

    }

    public static void findHighest(int[] highestNumbers, int numbers) {
        int temp = 0;

        if (highestNumbers[0] < numbers) {
            // if the highest numbes is small
            temp = highestNumbers[0];
            highestNumbers[0] = numbers;

            if (highestNumbers[1] < temp) {
                highestNumbers[1] = temp;
            }

        } else if (highestNumbers[1] < numbers && highestNumbers[0] > numbers) {
            // if the second highest is small
            temp = highestNumbers[1];
            highestNumbers[1] = numbers;
        }

    }

}
