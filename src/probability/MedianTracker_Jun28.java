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
        for (int i = 0; i < 10; i++) {

            //mySolution.read((int) (Math.random() * 100));
            //System.out.println(mySolution.sample());

        }




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
    }

    public Double median() {
        // write your implementation here.
        return null;
    }

}
