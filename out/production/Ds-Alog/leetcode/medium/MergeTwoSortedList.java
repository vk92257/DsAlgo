
public class MergeTwoSortedList {

    /*
     * You are given the heads of two sorted linked lists list1 and list2.
     * 
     * Merge the two lists in a one sorted list. The list should be made by splicing
     * together the nodes of the first two lists.
     * 
     * Return the head of the merged linked list.
     * 
     * 
     * 
     * Example 1:
     * 
     * 
     * Input: list1 = [1,2,4], list2 = [1,3,4]
     * Output: [1,1,2,3,4,4]
     * Example 2:
     * 
     * Input: list1 = [], list2 = []
     * Output: []
     * Example 3:
     * 
     * Input: list1 = [], list2 = [0]
     * Output: [0]
     * 
     * 
     * Constraints:
     * 
     * The number of nodes in both lists is in the range [0, 50].
     * -100 <= Node.val <= 100
     * Both list1 and list2 are sorted in non-decreasing order.
     * 
     * 
     */

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode head1 = new ListNode(1);

        // for (int i : input) {
        // addNode(head, i);
        // }

        ListNode.addNode(head, 2);
        ListNode.addNode(head, 4);
        // ListNode. addNode(head, 3);

        ListNode.addNode(head1, 3);
        ListNode.addNode(head1, 5);
        ListNode.addNode(head1, 4);

        System.out.println("Printing the output ");
        ListNode.traverse(mergeTwoLists(head, head1));

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // ListNode.traverse(list1);
        // ListNode.traverse(list2);

        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while (temp1.next != null && temp2.next != null) {
            if (temp1.val < temp2.val) {

                System.out.println(temp1.val + "-------" + temp2.val);
                ListNode one = temp1.next; // 4
                ListNode two = temp2.next; // 4
                temp1.next = temp2; // 3

                temp1 = temp1.next;
                temp1.next = one;
                temp1 = temp1.next;
                temp2 = two;

            } else if (temp1.val == temp2.val) {
                ListNode one = temp1.next; // 2
                ListNode two = temp2.next; // 3

                temp1.next = temp2;
                temp1 = temp1.next;

                temp1.next = one;
                temp1 = temp1.next.next;

                temp2 = two;

            } else {
                ListNode one = temp1.next; // 4
                ListNode two = temp2.next; // 3
                ListNode current = temp1; // 3

                temp1 = temp2; // 2
                temp1.next = current; // 3

                temp1 = temp1.next; // 3
                temp1.next = one; // 4

                temp2 = two; // 3
            }
        }

        if (temp2 != null) {
            temp1.next = temp2;
        }

        return list1;
    }

}
