
class TwoSum {

    /*
     * https://leetcode.com/problems/two-sum/
     * Given an array of integers nums and an integer target, return indices of the
     * two numbers such that they add up to target.
     * 
     * You may assume that each input would have exactly one solution, and you may
     * not use the same element twice.
     * 
     * You can return the answer in any order.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     * Example 2:
     * 
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     * Example 3:
     * 
     * Input: nums = [3,3], target = 6
     * Output: [0,1]
     * 
     * 
     */

    public static void main(String[] args) {
        // int[] nums = { 2, 7, 11, 15 };
        // int target = 9;

        // int[] nums = { 3, 2, 4 };
        // int target = 6;

        int[] nums = { 3, 3 };
        int target = 6;

        int[] output = twoSum(nums, target);
        for (int i : output) {
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int lastIndex = nums.length;
        int[] output = new int[2];
        for (int i = 0; i < lastIndex; i++) {
            for (int j = i + 1; j < lastIndex; j++) {
                if (target == nums[i] + nums[j]) {
                    output[0] = i;
                    output[1] = j;

                    System.out.println("FOUND");
                    return output;
                }
            }

        }
        return output;

    }

    // public static int[] twoSum(int[] nums, int target) {

    // int startIndex = 0;
    // int lastIndex = nums.length - 1;
    // int[] output = new int[2];

    // while (startIndex < lastIndex) {
    // int newTargetValue = target - nums[startIndex];

    // System.out.print(" " + nums[startIndex]);
    // System.out.print(" " + nums[lastIndex]);
    // System.out.println(" ===> " + newTargetValue);

    // if (newTargetValue == nums[lastIndex]) {
    // output[0] = startIndex;
    // output[1] = lastIndex;

    // System.out.println("FOUND");
    // return output;
    // } else {
    // int secondItem = nums[lastIndex];
    // if (secondItem < newTargetValue) {
    // startIndex++;

    // } else {
    // lastIndex--;
    // }
    // }

    // }

    // return output;

    // }

}