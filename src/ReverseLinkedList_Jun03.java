/**
 * Created by vincenthu on 6/1/17.
 */
public class ReverseLinkedList_Jun03 {

    public static void main(String[] a) {

        ReverseLinkedList_Jun03 myReverse = new ReverseLinkedList_Jun03();
        ListNode head = null;
        System.out.println(myReverse.reverse(head));
        System.out.println(myReverse.recursiveReverse(head));

        head = new ListNode(1);
        head.next = null;
        System.out.println(myReverse.reverse(head));
        System.out.println(myReverse.recursiveReverse(head));

        ListNode tail = head;
        for(int i = 2; i < 6 ; i++) {
            ListNode newNode = new ListNode(i);
            tail.next = newNode;
            tail = tail.next;
        }
        System.out.println(myReverse.reverse(head));
        //System.out.println(myReverse.recursiveReverse(head));






    }

    public ListNode reverse(ListNode head) {
        // write your solution here
        if(head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode next = null;
        while(head != null) {
            //keep the next node before reversing
            next = head.next;
            //reverse
            head.next = prev;
            //the prev node proceeds
            prev = head;
            //the current node proceeds
            head = next;
        }
        //because the exit condition is head == null, the actual head of the reversed list is prev.
        return prev;
    }

    public ListNode recursiveReverse(ListNode head) {
        // write your solution here
        if(head == null || head.next == null) {
            return head;
        }

        ListNode nextNode = head.next;
        ListNode newHead = recursiveReverse(nextNode);
        head.next = null;
        nextNode.next = head;
        return newHead;

    }


}
