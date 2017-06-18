package hashtable_string_1;

/**
 * Created by polarbear on 6/13/17.
 */
public class MissingNum_Sol_2_SumDiff_Jun16 {
    public static void main(String[] a) {
        MissingNum_Sol_2_SumDiff_Jun16 mySubSets = new MissingNum_Sol_2_SumDiff_Jun16();
        System.out.println(mySubSets.missing(null));
        System.out.println(mySubSets.missing(new int[]{}));


        System.out.println(mySubSets.missing(new int[]{1,3,4,5}));


    }

    public int missing(int[] a) {
        //Write your solution here.
        if (a == null || a.length == 0) {
            return 1;
        }

        int diff = 0;
        for (int i = 0; i < a.length; i++) {
            diff += (i + 1) - a[i];
        }

        return diff + a.length + 1;

    }



}
