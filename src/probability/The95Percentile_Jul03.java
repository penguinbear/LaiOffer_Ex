package probability;

import java.util.List;

/**
 * Created by vincenthu on 5/31/17.
 */
public class The95Percentile_Jul03 {

    public static void main(String[] a){
        /*
        //main();
        Random5To1K_Jun28 mySolution = new Random5To1K_Jun28();
        for (int i = 0; i < 10; i++) {

            mySolution.read((int) (Math.random() * 100));
            System.out.println(mySolution.sample());

        }
        */




    }
    public int percentile95(List<Integer> lengths) {
        // write your solution here
        if (lengths == null || lengths.size() == 0) {
            return 0;
        }

        int[] buckets = new int[4097];
        for (Integer e : lengths) {
            if (e >= 0 && e <= 4096) {
                buckets[e]++;
            } else {
                return 0;
            }
        }

        int counter = 0;
        for (int i = 1; i < 4097; i++) {
            counter += buckets[i];
            if (counter >= lengths.size() * 0.95) {
                return i;
            }
        }
        return 0;

    }


}
