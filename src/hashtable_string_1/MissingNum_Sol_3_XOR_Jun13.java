package hashtable_string_1;

/**
 * Created by polarbear on 6/13/17.
 */
public class MissingNum_Sol_3_XOR_Jun13 {
    public static void main(String[] a) {
        MissingNum_Sol_3_XOR_Jun13 mySubSets = new MissingNum_Sol_3_XOR_Jun13();
        System.out.println(mySubSets.missing(null));
        System.out.println(mySubSets.missing(new int[]{}));


        System.out.println(mySubSets.missing(new int[]{1,3,4,5}));


    }

    public int missing(int[] a) {
        //Write your solution here.
        if (a == null || a.length == 0) {
            return 1;
        }

        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result ^= a[i] ^ (i + 1);
        }
        return result ^ (a.length + 1);
    }



}
