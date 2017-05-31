import java.util.Stack;

/**
 * Created by vincenthu on 5/31/17.
 */
public class MyStackWithMin_May31 {

    public static void main(String[] a) {
        MyStackWithMin_May31 myQueue = new MyStackWithMin_May31();
        if (myQueue.isEmpty()) {
            myQueue.offer(3);
        }
        if (myQueue.isEmpty()) {
            myQueue.offer(2);
        }
        System.out.println("size before poll: " + myQueue.size() + "| poll: " + myQueue.poll() + " | size after poll: " + myQueue.size());

        myQueue.offer(1);
        System.out.println("size before poll: " + myQueue.size() + "| poll: " + myQueue.poll() + " | size after poll: " + myQueue.size());
        System.out.println("size before poll: " + myQueue.size() + "| poll: " + myQueue.poll() + " | size after poll: " + myQueue.size());


    }

    /*
    public Solution() {
        // Write your solution here.
    }
    */

    public MyStackWithMin_May31() {
        // write your solution here

    }

    public int pop() {
        return -1;
    }

    public void push(int element) {

    }

    public int top() {
        return -1;
    }

    public int min() {
        return -1;
    }


}