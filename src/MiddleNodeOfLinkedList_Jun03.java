/**
 * Created by vincenthu on 6/1/17.
 */
public class MiddleNodeOfLinkedList_Jun03 {

    public static void main(String[] a) {

        MiddleNodeOfLinkedList_Jun03 myMiddleNode = new MiddleNodeOfLinkedList_Jun03();
        ListNode head = null;
        System.out.println(myMiddleNode.middleNode(head));

        head = new ListNode(1);
        head.next = null;
        System.out.println(myMiddleNode.middleNode(head));

        ListNode tail = head;
        for(int i = 2; i < 5 ; i++) {
            ListNode newNode = new ListNode(i);
            tail.next = newNode;
            tail = tail.next;
        }
        System.out.println(head);

        System.out.println(myMiddleNode.middleNode(head));






    }

    public ListNode middleNode(ListNode head) {
        // write your solution here
        if(head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }



}
