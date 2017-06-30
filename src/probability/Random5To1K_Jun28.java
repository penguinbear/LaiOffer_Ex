package probability;

/**
 * Created by vincenthu on 5/31/17.
 */
public class Random5To1K_Jun28 {

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
    public int random1000() {
        // write your solution here
        // you can use RandomFive.random5() for generating
        // 0 - 4 with equal probability.
        while (true) {
            int result = 0;
            //int result = (int)Math.pow(5,4) * RandomFive.random5() + 125 * RandomFive.random5() + 25 * RandomFive.random5() + 5 * RandomFive.random5() + RandomFive.random5();

            if (result < 3000) {
                return result/3;
            }

        }
    }


}
