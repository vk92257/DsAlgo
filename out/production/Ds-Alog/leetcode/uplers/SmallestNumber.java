import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

class SmallestNumber {

    public static void main(String[] args) {
        int[] nums = { 1, 3, 6, 4, 1, 2 };
        System.out.println(solution(nums));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> set = new TreeSet();

        for (int a : A) {
            set.add(a);
        }

        int N = set.size();

        int[] C = new int[N];

        int index = 0;

        for (int a : set) {
            C[index++] = a;
        }

        for (int i = 0; i < N; i++) {

            if (C[i] > 0 && C[i] <= N) {
                C[i] = 0;
            }
        }

        for (int i = 0; i < N; i++) {

            if (C[i] != 0) {
                return (i + 1);
            }
        }

        return (N + 1);
    }
}