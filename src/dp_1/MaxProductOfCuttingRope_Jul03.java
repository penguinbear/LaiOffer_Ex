package dp_1;

/**
 * Created by polarbear on 6/13/17.
 */
public class MaxProductOfCuttingRope_Jul03 {
    public static void main(String[] a) {//
        MaxProductOfCuttingRope_Jul03 mySolution = new MaxProductOfCuttingRope_Jul03();
        System.out.println(mySolution.maxProduct(0));
        System.out.println(mySolution.maxProduct(12));
        System.out.println(mySolution.maxProduct(300));

        System.out.println(mySolution.maxProduct(3));

    }
    public int maxProduct(int length) {
        if (length < 2) {
            return 0;
        }
        int[] maxProduct = new int[length + 1];
        maxProduct[1] = 0;
        maxProduct[2] = 1;
        for (int i = 3; i < maxProduct.length; i++) {
            for (int j = 1; j < i; j++) {
                maxProduct[i] = Math.max(maxProduct[i], Math.max(j, maxProduct[j]) * (i - j));
            }
        }

        return maxProduct[length];

    }



}
