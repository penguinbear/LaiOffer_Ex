import java.util.Arrays;
import java.util.Stack;

/**
 * Created by vincenthu on 5/31/17.
 */
public class MyQueueBy2Stacks_May31 {

    public static void main(String[] a){
        MyQueueBy2Stacks_May31 myQueue = new MyQueueBy2Stacks_May31();
        if (myQueue.isEmpty()) {
            myQueue.offer(3);
        }
        if (myQueue.isEmpty()) {
            myQueue.offer(2);
        }
        System.out.println("size before poll: "+ myQueue.size() + "| poll: " + myQueue.poll() + " | size after poll: " + myQueue.size() );

        myQueue.offer(1);
        System.out.println("size before poll: "+ myQueue.size() + "| poll: " + myQueue.poll() + " | size after poll: " + myQueue.size() );
        System.out.println("size before poll: "+ myQueue.size() + "| poll: " + myQueue.poll() + " | size after poll: " + myQueue.size() );






    }

    /*
    public Solution() {
        // Write your solution here.
    }
    */

    private Stack<Integer> stack_for_poll;
    private Stack<Integer> stack_for_offer;

    public MyQueueBy2Stacks_May31() {
        stack_for_poll = new Stack<Integer>();
        stack_for_offer = new Stack<Integer>();


    }

    public Integer poll() {
        if (stack_for_offer.empty() && stack_for_poll.empty()) {
            return null;
        }

        if(stack_for_poll.empty()) {
            while(!stack_for_offer.empty()) {
                stack_for_poll.push(stack_for_offer.pop());
            }
        }
        return stack_for_poll.pop();
    }

    public void offer(int element) {
        stack_for_offer.push(new Integer(element));
    }

    public Integer peek() {
        if (stack_for_offer.empty() && stack_for_poll.empty()) {
            return null;
        }

        if(stack_for_poll.empty()) {
            while(!stack_for_offer.empty()) {
                stack_for_poll.push(stack_for_offer.pop());
            }
        }
        return stack_for_poll.peek();
    }

    public int size() {
        return (stack_for_poll.size()+stack_for_offer.size());
    }

    public boolean isEmpty() {
        return (stack_for_offer.empty() && stack_for_poll.empty());
    }
}
