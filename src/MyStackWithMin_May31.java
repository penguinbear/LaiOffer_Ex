import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by vincenthu on 5/31/17.
 */
public class MyStackWithMin_May31 {

    public static void main(String[] a) {
        MyStackWithMin_May31 myStack = new MyStackWithMin_May31();
        myStack.push(5);
        myStack.push(2);
        myStack.push(8);
        myStack.push(1);
        myStack.push(1);
        myStack.push(5);
        System.out.println("push: 5, 2, 8, 1, 1, 5" +  "| min: " + myStack.min() + " | top: " + myStack.top());
        System.out.println("pop: " + myStack.pop() + "| min: " + myStack.min() + " | top: " + myStack.top());
        System.out.println("pop: " + myStack.pop() + "| min: " + myStack.min() + " | top: " + myStack.top());
        System.out.println("pop: " + myStack.pop() + "| min: " + myStack.min() + " | top: " + myStack.top());
        System.out.println("pop: " + myStack.pop() + "| min: " + myStack.min() + " | top: " + myStack.top());
        System.out.println("pop: " + myStack.pop() + "| min: " + myStack.min() + " | top: " + myStack.top());
        System.out.println("pop: " + myStack.pop() + "| min: " + myStack.min() + " | top: " + myStack.top());
        System.out.println("pop: " + myStack.pop() + "| min: " + myStack.min() + " | top: " + myStack.top());


    }

    /*
    public Solution() {
        // Write your solution here.
    }
    */

    public MyStackWithMin_May31() {
        // write your solution here
        mainStack = new LinkedList<>();
        minStack = new LinkedList<>();

    }

    private Deque<Integer> mainStack;
    private Deque<Integer> minStack;

    public int pop() {
        if(mainStack.size() == 0){
            return -1;
        }
        minStack.pop();
        return mainStack.pop();

    }

    public void push(int element) {
        Integer item = new Integer(element);
        mainStack.push(item);
        if(minStack.size() == 0 || item < minStack.peek()) {
            minStack.push(item);
        } else{
            minStack.push(minStack.peek());
        }

    }

    public int top() {
        if(mainStack.size() == 0) {
            return -1;
        }
        return mainStack.peek();
    }

    public int min() {
        if(minStack.size() == 0) {
            return -1;
        }
        return minStack.peek();
    }


}