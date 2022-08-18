import java.util.Arrays;

public class SecondHighest {
    public static void main(String[] args) {

        int[] input = { 1, 2, 2, 2 };
        int[] output = new int[2];
        Arrays.fill(output, 0);

        for (int i = 0; i < input.length; i++) {
            secondHighest(output, input[i]);
        }

        for (int i : output) {
            System.out.println("out put is like ----->>>>   " + i);
        }
    }

    public static void secondHighest(int[] secondHighest, int number) {
        int temp;

        if (secondHighest[0] < number) {
            temp = secondHighest[0];
            secondHighest[0] = number;
            if (secondHighest[1] < temp) {
                secondHighest[1] = temp;
            }

        } else if (secondHighest[1] < number && secondHighest[0] > number) {
            secondHighest[1] = number;
        }

    }

}
