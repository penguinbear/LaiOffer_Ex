/**
 * Created by vincenthu on 6/1/17.
 */
public class Merge2LinkedLists_Jun03 {

    public static void main(String[] a) {

        ListNode head_1 = null;
        ListNode head_2 = null;
        print(head_1, head_2);

        head_1 = new ListNode(1);
        print(head_1, head_2);

        head_2 = new ListNode(0);
        print(head_1, head_2);


        head_2 = new ListNode(2);
        print(head_1, head_2);

        ListNode tail_1 = head_1;
        ListNode tail_2 = head_2;


        for(int i = 2; i < 5 ; i++) {
            ListNode newNode = new ListNode(i*2);
            tail_1.next = newNode;
            tail_1 = tail_1.next;

            newNode = new ListNode(i*2+1);
            tail_2.next = newNode;
            tail_2 = tail_2.next;
        }
        print(head_1, head_2);






    }

    public static void print(ListNode head_1, ListNode head_2) {
        System.out.println("One: " + head_1);
        System.out.println("Two: " + head_2);
        System.out.println("Merged: " + merge(head_1, head_2));
        System.out.println();

    }

    public static ListNode merge(ListNode one, ListNode two) {
        // write your solution here
        if(one == null && two != null) {
            return two;
        }

        if(one != null && two == null) {
            return one;
        }

        if(one == null || two == null) {
            return null;
        }

        ListNode dummy_head = new ListNode(0);
        ListNode curr = dummy_head;
        while(one != null && two != null) {
            if(one.value < two.value) {
                curr.next = one;
                one = one.next;
            } else {
                curr.next = two;
                two = two.next;
            }
            curr = curr.next;
            curr.next = null;
        }
        if(one == null) {
            curr.next = two;
        }
        if(two == null) {
            curr.next = one;
        }

        return dummy_head.next;


    }



}
