package hashtable_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by polarbear on 6/13/17.
 */
public class CommonNum_Sol_1_BruteForce_Jun14 {
    public static void main(String[] a) {
        CommonNum_Sol_1_BruteForce_Jun14 mySubSets = new CommonNum_Sol_1_BruteForce_Jun14();
        //List<Integer> A = Arrays.asList(new Integer[]{1, 1, 2, 2, 3});
        //List<Integer> B = Arrays.asList(new Integer[]{1, 1, 2, 5, 6});
        List<Integer> A = Arrays.asList(new Integer[]{1, 2});
        List<Integer> B = Arrays.asList(new Integer[]{});

        System.out.println(mySubSets.common(null, B));
        System.out.println(mySubSets.common(A, B));



    }

    public List<Integer> common(List<Integer> A, List<Integer> B) {
        //Write your solution here.
        List<Integer> common = new ArrayList<>();

        if (A == null || A.size() == 0 || B == null || B.size() == 0) {
            return common;
        }
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            int a = A.get(i);
            int b = B.get(j);

            if (a == b) {
                common.add(a);
                i++;
                j++;
            } else if (a > b) {
                j++;
            } else {
                i++;
            }
        }

        return common;

    }



}
