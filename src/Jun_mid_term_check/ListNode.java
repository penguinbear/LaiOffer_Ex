package Jun_mid_term_check;

/**
 * Created by polarbear on 6/3/17.
 */
public class ListNode {

    public int value;
    public ListNode next;

    public ListNode(int value) {
        this.value = value;
        next = null;
    }

    public String toString() {
        String listString = "[" + this.value + "]";
        ListNode nextNode = this.next;
        int max = 20;
        while(nextNode != null && max != 0) {
            listString += "->[" + nextNode.value + "]";
            nextNode = nextNode.next;

            max--;
        }

        return listString;

    }

}