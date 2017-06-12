/**
 * Created by vincenthu on 6/1/17.
 */
public class ReorderLinkedList_Jun03 {

    public static void main(String[] a) {

        ReorderLinkedList_Jun03 myMiddleNode = new ReorderLinkedList_Jun03();
        ListNode head = null;
        System.out.println(myMiddleNode.reorder(head));

        head = new ListNode(1);
        head.next = null;
        System.out.println(myMiddleNode.reorder(head));
        System.out.println("***");

        ListNode tail = head;
        for(int i = 2; i < 10; i++) {
            ListNode newNode = new ListNode(i);
            tail.next = newNode;
            tail = tail.next;
/*
            System.out.println(head);
            //reorder changed the position of tail in the list, say, tail is no longer the last node
            System.out.println(myMiddleNode.reorder(head)); .
            System.out.println();
*/
        }
        System.out.println(head);
        System.out.println(myMiddleNode.reorder(head));
        System.out.println();

    }

    public ListNode reorder(ListNode head) {
        // Write your solution here.
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }

        //locate the middle point
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head_2 = slow.next;
        slow.next = null; //wrap up the first half

        //reverse the second half
        ListNode prev = null;
        ListNode next = head_2;
        while(next != null) {
            next = head_2.next;
            head_2.next = prev;
            prev = head_2;
            head_2 = next;
        }
        head_2 = prev;

        //interweave two lists
        ListNode head_1 = head;
        ListNode curr = head_1;
        while(head_1 != null && head_2 != null) {
            head_1 = head_1.next;
            curr.next = head_2;
            head_2 = head_2.next;
            curr = curr.next;
            curr.next = head_1;
            curr = head_1;
        }
        return head;
    }

}
