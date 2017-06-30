package dfs_1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by polarbear on 6/13/17.
 */
public class AllPermutations_I_Jun30 {
    public static void main(String[] a) {
        AllPermutations_I_Jun30 mySubSets = new AllPermutations_I_Jun30();
        String set = "abcd";
        //String set = "ab";
        System.out.println(mySubSets.permutations(set));
        set = "";
        System.out.println(mySubSets.permutations(set));

        set = null;
        System.out.println(mySubSets.permutations(set));


    }

    public List<String> permutations(String set) {
        List<String> result = new ArrayList<>();
        if (set == null) {
            return result;
        }
        permutations(set.toCharArray(), 0, result);
        return result;
    }

    private void permutations(char[] set, int level, List<String> result) {
        if (level == set.length) {
            result.add(String.valueOf(set));
            return;
        }

        for (int i = level; i < set.length; i++) {
            swap(set, level, i);
            permutations(set, level + 1, result);
            swap(set, level, i);
        }
    }

    private void swap(char[] a, int left, int right) {
        if (left == right || left < 0 || right < 0 || left > a.length - 1 || right > a.length - 1) {
            return;
        }

        char tmp = a[left];
        a[left] = a[right];
        a[right] = tmp;


    }


}
