/**
 * Created by vincenthu on 6/1/17.
 */
public class PartitionLinkedList_Jun03 {

    public static void main(String[] a) {

        PartitionLinkedList_Jun03 myPartitioner = new PartitionLinkedList_Jun03();
        ListNode head = null;
        System.out.println(head);
        System.out.println(myPartitioner.partition(head, 1));
        System.out.println();

        head = new ListNode(1);
        //head.next = null;
        System.out.println(head);
        System.out.println(myPartitioner.partition(head, 2));
        System.out.println();

        head.next = new ListNode(2);
        System.out.println(head);
        System.out.println(myPartitioner.partition(head, 2));
        System.out.println();



        ListNode tail = head.next;
        for(int i = 2; i < 15 ; i++) {
            ListNode newNode = new ListNode(10 - i);
            tail.next = newNode;
            tail = tail.next;
        }
        //tail.next = head.next;
        System.out.println(head);

        System.out.println(myPartitioner.partition(head, 0));
        System.out.println();






    }

    public ListNode partition(ListNode head, int target) {
        // write your solution here
        if(head == null || head.next == null) {
            return head;
        }

        ListNode curr = head; //the initial node of curr is head
        ListNode sublist_head = null; //sublist for all the elements larger than or equal to target, initially empty
        ListNode sublist_tail = null;

        //nothing to do with the case that "head.value < target" -> just skip the head and simply check the next node
        while(head.value >= target) {
            head = head.next;
            curr.next = null;
            if(sublist_head == null) {
                sublist_head = curr;
                sublist_tail = curr;
            } else {
                sublist_tail.next = curr;
                sublist_tail = sublist_tail.next;
            }

            curr = head;

        }

        while(curr.next != null) {
            if(curr.next.value < target) {
                curr = curr.next;
            } else {
                if(sublist_head == null) {
                    sublist_head = curr.next;
                    sublist_tail = sublist_head;
                } else {
                    sublist_tail.next = curr.next;
                    sublist_tail = sublist_tail.next;
                }
                curr.next = curr.next.next;

                sublist_tail.next = null;
            }
        }

        curr.next = sublist_head;

        return head;
    }



}
