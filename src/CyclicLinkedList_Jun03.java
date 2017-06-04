/**
 * Created by vincenthu on 6/1/17.
 */
public class CyclicLinkedList_Jun03 {

    public static void main(String[] a) {

        CyclicLinkedList_Jun03 myCycleChecker = new CyclicLinkedList_Jun03();
        ListNode head = null;
        System.out.println(myCycleChecker.hasCycle(head));

        head = new ListNode(1);
        head.next = null;
        System.out.println(myCycleChecker.hasCycle(head));

        ListNode tail = head;
        for(int i = 2; i < 5 ; i++) {
            ListNode newNode = new ListNode(i);
            tail.next = newNode;
            tail = tail.next;
        }
        tail.next = head.next;
        System.out.println(head);

        System.out.println(myCycleChecker.hasCycle(head));






    }

    public boolean hasCycle(ListNode head) {
        // write your solution here
        if(head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }

        }
        return false;
    }



}
