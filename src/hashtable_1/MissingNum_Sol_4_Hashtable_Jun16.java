package hashtable_1;

import java.util.HashSet;

/**
 * Created by polarbear on 6/13/17.
 */
public class MissingNum_Sol_4_Hashtable_Jun16 {
    public static void main(String[] a) {
        MissingNum_Sol_4_Hashtable_Jun16 mySubSets = new MissingNum_Sol_4_Hashtable_Jun16();
        System.out.println(mySubSets.missing(null));
        System.out.println(mySubSets.missing(new int[]{}));


        System.out.println(mySubSets.missing(new int[]{1,3,4,5}));


    }

    public int missing(int[] a) {
        //Write your solution here.
        if (a == null || a.length == 0) {
            return 1;
        }

        HashSet<Integer> hash = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            hash.add(a[i]);
        }

        for (int i = 1; i <= a.length + 1; i++) {
            if (!hash.contains(i)) {
                return i;
            }
        }
        return 0;


    }



}
