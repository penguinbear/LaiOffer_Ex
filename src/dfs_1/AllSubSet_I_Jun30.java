package dfs_1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by polarbear on 6/13/17.
 */
public class AllSubSet_I_Jun30 {
    public static void main(String[] a) {
        AllSubSet_I_Jun30 mySubSets = new AllSubSet_I_Jun30();
        //String set = "abc";
        String set = "a";
        System.out.println(mySubSets.subSets(set));
        set = "";
        System.out.println(mySubSets.subSets(set));

        set = null;
        System.out.println(mySubSets.subSets(set));


    }

    public List<String> subSets(String set) {
        List<String> subSets = new ArrayList<>();

        if (set == null) {
            return subSets;
        }
        if (set.length() == 0) {
            subSets.add("");
            return subSets;
        }

        subSets.addAll(subSets(set, 0, ""));
        return subSets;
    }

    private List<String> subSets(String set, int index, String prefix) {
        List<String> subSets = new ArrayList<>();

        if (index == set.length()) {
            subSets.add(prefix);
            return subSets;
        }

        subSets.addAll(subSets(set, index + 1, prefix));
        subSets.addAll(subSets(set, index + 1, prefix + set.charAt(index)));
        return subSets;
    }
}
