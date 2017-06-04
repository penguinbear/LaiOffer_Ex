/**
 * Created by vincenthu on 6/1/17.
 */
public class InsertInLinkedList_Jun03 {

    public static void main(String[] a) {

        InsertInLinkedList_Jun03 myInserter = new InsertInLinkedList_Jun03();
        ListNode head = null;
        System.out.println(head);
        System.out.println(myInserter.insert(head, 1));
        System.out.println();

        head = new ListNode(1);
        //head.next = null;
        System.out.println(head);
        System.out.println(myInserter.insert(head, 0));
        System.out.println();

        ListNode tail = head;
        for(int i = 2; i < 5 ; i++) {
            ListNode newNode = new ListNode(i);
            tail.next = newNode;
            tail = tail.next;
        }
        //tail.next = head.next;
        System.out.println(head);

        System.out.println(myInserter.insert(head, 8));
        System.out.println();






    }

    public ListNode insert(ListNode head, int value) {
        // write your solution here
        if(head == null || value <= head.value) {
            ListNode newHead = new ListNode(value);
            newHead.next = head;
            return newHead;
        }

        ListNode curr = head; //head.value > value
        while(curr != null && curr.next != null && curr.next.value < value) {
            curr = curr.next;
        }

        //insert the new node
        ListNode newNode = new ListNode(value);
        newNode.next = curr.next;
        curr.next = newNode;


        return head;
    }



}
