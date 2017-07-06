package dfs_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by polarbear on 6/13/17.
 */
public class AllPermutations_II_Jul03 {
    public static void main(String[] a) {
        AllPermutations_II_Jul03 mySubSets = new AllPermutations_II_Jul03();
        String set = "abcd";
        //String set = "ab";
        System.out.println(mySubSets.permutations(set));
        set = "";
        System.out.println(mySubSets.permutations(set));

        set = "aab";
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

        HashSet<Character> hashset = new HashSet<>();
        for (char c : set) {
            hashset.add(c);
        }

        for (int i = level; i < set.length; i++) {
            if (hashset.contains(set[i])) {
                hashset.remove(set[i]);
                swap(set, level, i);
                permutations(set, level + 1, result);
                swap(set, level, i);

            }
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
