package dfs_1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by polarbear on 6/13/17.
 */
public class AllSubSet_I_Jun13 {
    public static void main(String[] a) {
        AllSubSet_I_Jun13 mySubSets = new AllSubSet_I_Jun13();
        String set = "abc";
        //String set = "a";
        System.out.println(mySubSets.subSets(set));
        set = "";
        System.out.println(mySubSets.subSets(set));

        set = null;
        System.out.println(mySubSets.subSets(set));


    }

    public List<String> subSets(String set) {
        //Write your solution here.
        List<String> subsets = new ArrayList<>();
        if (set == null) {
            return subsets;
        }

        if (set == "") {
            subsets.add(set);
            return subsets;
        }

        return subSets("", set);
    }

    private List<String> subSets(String prefix, String pool) {
        List<String> subsets = new ArrayList<>();
        if (pool.length() == 0) {
            subsets.add(prefix);
            return subsets;
        }
        String element = pool.substring(0, 1);
        pool = pool.substring(1);
        subsets.addAll(subSets(prefix + element, pool));
        subsets.addAll(subSets(prefix, pool));

        //subsets.addAll(subSets(prefix.concat(element), pool));
        return subsets;
    }
}
