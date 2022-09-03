public class IC {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 1 };
        int[] nums1 = { 2, 3, 3 };
        System.out.println(solution(nums, nums1));
    }

    public static boolean solution(int[] A, int[] B) {
        return isCyclic(A.length, A, B);
    }

    private static boolean checkCycle(int node, int[] A, int[] B, int vis[], int dfsVis[]) {
        vis[node] = 1;
        dfsVis[node] = 1;

        for (Integer neighbor : B) {
            if (vis[neighbor] == 0) {
                if (checkCycle(neighbor, A, B, vis, dfsVis) == true) {
                    return true;
                }
            } else if (dfsVis[neighbor] == 1) {
                return true;
            }
        }
        dfsVis[node] = 0;
        return false;
    }

    public static boolean isCyclic(int N, int[] A, int[] B) {
        int vis[] = new int[N];
        int dfsVis[] = new int[N];

        for (int i = 0; i < N; i++) {
            if (vis[i] == 0) {
                if (checkCycle(i, A, B, vis, dfsVis) == true)
                    return true;
            }
        }
        return false;
    }

}
