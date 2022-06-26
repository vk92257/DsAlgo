import java.util.ArrayList;
import java.util.List;

// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

// You may assume the two numbers do not contain any leading zero, except the number 0 itself.

public class AddTwoNumbers {

    // example one
    // static int l1[] = { 9, 9, 9, 9, 9, 9, 9 };
    // static int l2[] = { 9, 9, 9, 9 };

    // out put = [8,9,9,9,0,0,0,1]

    // static int l1[] = { 2, 4, 3 };
    // static int l2[] = { 5, 6, 4 };

    static int l1[] = { 0 };
    static int l2[] = { 0 };

    public static void main(String[] args) {
        //
        // String data = "62345";
        // Integer.parseInt(String.valueOf(data.charAt(0)));
        // System.out.println(data.charAt(0));

        // Array solution

        /**
         * List<Integer> outputList = addTwoSum(l1, l2);
         * 
         * for (Integer item : outputList) {
         * System.out.println(item);
         * }
         * 
         * System.out.println(" ");
         */

        // testing input one
        /*
         * ListNode l1 = null;
         * l1 = addNode(2, l1);
         * l1 = addNode(4, l1);
         * l1 = addNode(3, l1);
         * 
         * traverseList(l1);
         * 
         * ListNode l2 = null;
         * l2 = addNode(5, l2);
         * l2 = addNode(6, l2);
         * l2 = addNode(4, l2);
         * 
         * traverseList(l2);
         */

        // testing input two

        /*
         * ListNode l1 = null;
         * l1 = addNode(0, l1);
         * 
         * traverseList(l1);
         * 
         * ListNode l2 = null;
         * l2 = addNode(0, l2);
         * 
         * traverseList(l2);
         */

        // testing input three

        ListNode l1 = null;
        l1 = addNode(9, l1);
        l1 = addNode(9, l1);
        l1 = addNode(9, l1);
        l1 = addNode(9, l1);
        l1 = addNode(9, l1);
        l1 = addNode(9, l1);
        traverseList(l1);

        ListNode l2 = null;
        l2 = addNode(9, l2);
        l2 = addNode(9, l2);
        l2 = addNode(9, l2);
        l2 = addNode(9, l2);

        traverseList(l2);

        System.out.println("printing the out put ");

        ListNode output = addTwoNumbers(l1, l2);
        traverseList(output);

    }

    public static List<Integer> addTwoSum(int[] listOne, int[] listTwo) {

        int counterOne = 0;
        int counterTwo = 0;
        int carrayForward = 0;
        ArrayList<Integer> outputList = new ArrayList<Integer>();

        while (counterOne < listOne.length || counterTwo < listTwo.length) {
            int numberOne = 0;
            int numberTwo = 0;

            if (counterOne < listOne.length) {
                numberOne = listOne[counterOne];
                counterOne++;
            }

            if (counterTwo < listTwo.length) {
                numberTwo = listTwo[counterTwo];
                counterTwo++;
            }

            int sum = numberOne + numberTwo + carrayForward;
            if (sum > 9) {
                String stringSum = String.valueOf(sum);
                int number = Integer.parseInt(String.valueOf(stringSum.charAt(1)));

                outputList.add(number);

                carrayForward = Integer.parseInt(String.valueOf(stringSum.charAt(0)));

            } else {
                carrayForward = 0;
                outputList.add(sum);
            }

        }

        if (carrayForward > 0)
            outputList.add(carrayForward);

        return outputList;
    }

    public static void traverseList(ListNode head) {
        ListNode temp = head;
        if (temp == null) {
            return;
        }

        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int carrayForward = 0;
        ListNode head = null;

        while (temp1 != null || temp2 != null) {

            int numberOne = 0;
            int numberTwo = 0;

            if (temp1 != null) {
                numberOne = temp1.val;
                temp1 = temp1.next;
            }

            if (temp2 != null) {
                numberTwo = temp2.val;
                temp2 = temp2.next;
            }

            int sum = numberOne + numberTwo + carrayForward;
            if (sum > 9) {
                String stringSum = String.valueOf(sum);
                int number = Integer.parseInt(String.valueOf(stringSum.charAt(1)));
                carrayForward = Integer.parseInt(String.valueOf(stringSum.charAt(0)));
                head = addNode(number, head);

            } else {
                carrayForward = 0;
                head = addNode(sum, head);

            }

        }

        if (carrayForward > 0) {
            head = addNode(carrayForward, head);

        }

        return head;
    }

    public static ListNode addNode(int value, ListNode head) {
        ListNode temp = head;
        if (temp == null) {
            return new ListNode(value);
        }

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new ListNode(value);

        return head;

    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}

// * Definition for singly-linked list.
