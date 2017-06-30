package probability;

/**
 * Created by vincenthu on 5/31/17.
 */
public class ReservoirSampling_Jun28 {

    public static void main(String[] a){
        //main();
        ReservoirSampling_Jun28 mySolution = new ReservoirSampling_Jun28();
        for (int i = 0; i < 10; i++) {

            mySolution.read((int) (Math.random() * 100));
            System.out.println(mySolution.sample());

        }




    }

    private int count;
    private Integer sample;

/*
    public Solution() {
        // Write your constructor code here if necessary.
        count = 0;
        sample = null;

    }
*/
    public void read(int value) {
        // Write your implementation here.
        count++;
        if ((int) (Math.random() * count) == 0) {
            sample = value;
        }

    }

    public Integer sample() {

        return sample;
    }


}
