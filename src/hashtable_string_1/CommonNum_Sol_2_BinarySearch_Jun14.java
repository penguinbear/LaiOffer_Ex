package hashtable_string_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by polarbear on 6/13/17.
 */
public class CommonNum_Sol_2_BinarySearch_Jun14 {
    public static void main(String[] a) {
        CommonNum_Sol_2_BinarySearch_Jun14 mySubSets = new CommonNum_Sol_2_BinarySearch_Jun14();
        List<Integer> A = Arrays.asList(new Integer[]{1, 1, 2, 2, 3});
        List<Integer> B = Arrays.asList(new Integer[]{1, 1, 2, 5, 6});

        //Integer[] arrayA = new Integer[]{1, 2, 3, 4, 5, 6};
        //Integer[] arrayA = new Integer[]{1, 1, 1, 1, 1, 1};
        //List<Integer> A = new ArrayList<>();
        //A.addAll(Arrays.asList(arrayA));

        //Integer[] arrayB = new Integer[]{1, 3, 3, 3};
        //Integer[] arrayB = new Integer[]{1, 1, 1, 1};

        //List<Integer> B = new ArrayList<>();
        //B.addAll(Arrays.asList(arrayB));
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

        List<Integer> cloneA = new LinkedList<>(A);
        List<Integer> cloneB = new LinkedList<>(B);

        List<Integer> shortList, longList;

        if (cloneA.size() < cloneB.size()) {
            shortList = cloneA;
            longList = cloneB;
        } else {
            shortList = cloneB;
            longList = cloneA;
        }

        int start = 0;
        for (Integer ele : shortList) {
            int end = longList.size() - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (ele == longList.get(mid)) {
                    common.add(ele);
                    //to handle duplicates
                    ele = longList.remove(mid);
                    break;
                } else if (ele < longList.get(mid)) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return common;

    }



}
