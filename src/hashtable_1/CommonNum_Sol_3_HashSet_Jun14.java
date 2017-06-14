package hashtable_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by polarbear on 6/13/17.
 */
public class CommonNum_Sol_3_HashSet_Jun14 {
    public static void main(String[] a) {
        CommonNum_Sol_3_HashSet_Jun14 mySubSets = new CommonNum_Sol_3_HashSet_Jun14();
        List<Integer> A = Arrays.asList(new Integer[]{1, 1, 2, 2, 3});
        List<Integer> B = Arrays.asList(new Integer[]{1, 1, 2, 5, 6});
        //List<Integer> A = Arrays.asList(new Integer[]{1, 2});
        //List<Integer> B = Arrays.asList(new Integer[]{});

        System.out.println(mySubSets.common(null, B));
        System.out.println(mySubSets.common(A, B));



    }

    public List<Integer> common(List<Integer> A, List<Integer> B) {
        //Write your solution here.
        List<Integer> common = new ArrayList<>();

        if (A == null || A.size() == 0 || B == null || B.size() == 0) {
            return common;
        }

        HashSet<Integer> set = new HashSet<>();
        for (Integer ele : A) {
            set.add(ele);
        }

        for (Integer ele : B) {
            if (set.contains(ele)) {
                common.add(ele);
            }
        }

        return common;

    }



}
