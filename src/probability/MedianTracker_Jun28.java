package probability;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Created by vincenthu on 5/31/17.
 */
public class MedianTracker_Jun28 {

    public static void main(String[] a){
        //main();
        MedianTracker_Jun28 mySolution = new MedianTracker_Jun28();
        mySolution.read(1);
        System.out.println(mySolution.median());

        mySolution.read(2);
        System.out.println(mySolution.median());

        mySolution.read(3);
        System.out.println(mySolution.median());

        mySolution.read(10);
        System.out.println(mySolution.median());


    }

    private PriorityQueue<Integer> small_half;
    private PriorityQueue<Integer> large_half;

    public MedianTracker_Jun28() {
        // add new fields and complete the constructor if necessary.
        small_half = new PriorityQueue<>(Collections.reverseOrder());
        large_half = new PriorityQueue<>();
    }

    public void read(int value) {
        // write your implementation here.
        if (small_half.isEmpty() || small_half.peek() > value) {
            small_half.offer(value);
            if (small_half.size() > large_half.size() + 1) {
                large_half.offer(small_half.poll());
            }
        } else {
            large_half.offer(value);
            if(large_half.size() > small_half.size()) {
                small_half.offer((large_half.poll()));
            }
        }
    }

    public Double median() {
        // write your implementation here.
        if (small_half.isEmpty()) {
            return null;
        }

        if (small_half.size() == large_half.size()) {
            return Double.valueOf((double) (small_half.peek() + large_half.peek()) / 2);
        } else {
            return Double.valueOf(small_half.peek());
        }
    }

}
