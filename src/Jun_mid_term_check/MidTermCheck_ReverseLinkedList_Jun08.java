package Jun_mid_term_check;

/**
 * Created by vincenthu on 6/1/17.
 */
public class MidTermCheck_ReverseLinkedList_Jun08 {

    public static void main(String[] a) {

        MidTermCheck_ReverseLinkedList_Jun08 myReverse = new MidTermCheck_ReverseLinkedList_Jun08();
        ListNode head = null;
        //System.out.println(myReverse.reverse(head));
        System.out.println(myReverse.recursiveReverse(head));

        head = new ListNode(1);
        head.next = null;
        //System.out.println(myReverse.reverse(head));
        System.out.println(myReverse.recursiveReverse(head));

        ListNode tail;
        tail = head;
        for(int i = 2; i < 6 ; i++) {
            ListNode newNode = new ListNode(i);
            tail.next = newNode;
            tail = tail.next;
        }
        //System.out.println(myReverse.reverse(head));
        System.out.println(myReverse.recursiveReverse(head));






    }

    //
    public ListNode reverse(ListNode head) {
        //handling corner cases:
        // 1. null list
        // 2. one-element list
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;		//initialize a LN reference to maintain previous node
        ListNode next = null;		//initialize a LN reference to maintain next node

        while (head != null) {
            //point next the the next node of the current head
            next = head.next;

            //the reverse occurs
            head.next = prev;

            //point prev to the previous node of the current head
            prev = head;

//move to the next node
            head = next;
        }

        //termination condition is head == null, say, the original tail node has been reversed
        return prev;
    }

    public ListNode recursiveReverse(ListNode head) {
        //handling corner cases:
        // 1. null list
        // 2. one-element list
        if (head == null || head.next == null) {
            return head;
        }

        //reverse the rest of the list after the current head;
        ListNode newHead = reverse(head.next);

        //reverse the current head and all its successive nodes
        head.next.next = head;
        //terminate the new list
        head.next = null;

        return newHead;

    }


}
