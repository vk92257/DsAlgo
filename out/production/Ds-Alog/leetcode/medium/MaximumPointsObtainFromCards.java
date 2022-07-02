/* There are several cards arranged in a row, and each card has an associated number of points. The points are given in the integer array cardPoints.

In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.

Your score is the sum of the points of the cards you have taken.

Given the integer array cardPoints and the integer k, return the maximum score you can obtain.



Example 1:

Input: cardPoints = [1,2,3,4,5,6,1], k = 3
Output: 12
Explanation: After the first step, your score will always be 1. However, choosing the rightmost card first will maximize your total score. The optimal strategy is to take the three cards on the right, giving a final score of 1 + 6 + 5 = 12.


Example 2:

Input: cardPoints = [2,2,2], k = 2
Output: 4
Explanation: Regardless of which two cards you take, your score will always be 4.

Example 3:

Input: cardPoints = [9,7,7,9,7,7,9], k = 7
Output: 55
Explanation: You have to take all the cards. Your score is the sum of points of all cards.


*/
class MaximumPointsObtainFromCards {

    public static void main(String[] args) {

        // int input[] = { 1, 2, 3, 4, 5, 6, 1 };
        // int maxMove = 3;

        // int input[] = { 2, 2, 2 };
        // int maxMove = 2;

        // int input[] = { 9, 7, 7, 9, 7, 7, 9 };
        // int maxMove = 7;

        // int input[] = { 100, 40, 17, 9, 73, 75 }; /* 248 */
        // int maxMove = 3;

        int input[] = { 1, 79, 80, 1, 1, 1, 200, 1 }; /* 202 */
        int maxMove = 3;

        System.out.println(maximumPointsObtainFromCards(input, maxMove));

    }

    public static int maximumPointsObtainFromCards(int[] cardPoints, int k) {
        // int sum = 0;

        // int oppositeIndex = cardPoints.length - 1;
        // for (int i = 0; i < k; i++) {
        // if (cardPoints[i] > cardPoints[oppositeIndex]) {
        // sum += cardPoints[i];
        // } else {
        // sum += cardPoints[oppositeIndex];
        // oppositeIndex--;
        // }

        // }

        // return sum;

        int arraySum = 0;
        for (int i = 0; i < cardPoints.length; i++) {
            arraySum += cardPoints[i];
        }
        // when k == cardPoints.length
        if (k == cardPoints.length) {
            return arraySum;
        }
        // get the minimum sum subarray of length ()
        int minSum = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0, right = 0;
        int length = cardPoints.length - k - 1;

        // get the sum of first (cardPoints.length - k - 1) elements
        for (right = 0; right < length; right++) {
            sum += cardPoints[right];
        }

        // get the min sub array sum of length (cardPoints.length - k)
        while (right < cardPoints.length) {
            sum += cardPoints[right];

            minSum = Math.min(minSum, sum);
            sum -= cardPoints[left++];

            right++;
        }

        return arraySum - minSum;
    }

}