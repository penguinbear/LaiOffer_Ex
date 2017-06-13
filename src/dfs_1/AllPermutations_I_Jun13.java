package dfs_1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by polarbear on 6/13/17.
 */
public class AllPermutations_I_Jun13 {
    public static void main(String[] a) {
        AllPermutations_I_Jun13 mySubSets = new AllPermutations_I_Jun13();
        String set = "abc";
        //String set = "ab";
        System.out.println(mySubSets.permutations(set));
        set = "";
        System.out.println(mySubSets.permutations(set));

        set = null;
        System.out.println(mySubSets.permutations(set));


    }

    public List<String> permutations(String set) {
        //Write your solution here.
        List<String> subsets = new ArrayList<>();
        if (set == null) {
            return subsets;
        }

        if (set == "") {
            subsets.add(set);
            return subsets;
        }

        return permutations(set.toCharArray(), 1);
    }

    private List<String> permutations(char[] set, int level) {
        List<String> subsets = new ArrayList<>();
        if (set.length == level) {
            subsets.add(String.valueOf(set));
            return subsets;
        }

        for (int i = level - 1; i < set.length; i++) {
            swap(set, level - 1, i);
            subsets.addAll(permutations(set, level + 1));
            swap(set, level - 1, i);
        }
        return subsets;
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
