package dfs_1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by polarbear on 6/13/17.
 */
public class ValidParentheses_I_Jun13 {
    public static void main(String[] a) {
        ValidParentheses_I_Jun13 mySubSets = new ValidParentheses_I_Jun13();
        System.out.println(mySubSets.validParentheses(-1));
        System.out.println(mySubSets.validParentheses(0));
        System.out.println(mySubSets.validParentheses(1));
        System.out.println(mySubSets.validParentheses(3));

        System.out.println(mySubSets.validParentheses(8));


    }

    public List<String> validParentheses(int n) {
        //Write your solution here.
        if (n < 0) {
            return null;
        }

        List<String> subsets = new ArrayList<>();

        if (n == 0) {
            subsets.add("");
            return subsets;
        }



        return validParentheses("", n);
    }


    private List<String> validParentheses(String prefix, int pairs) {
        List<String> subsets = new ArrayList<>();
        if (prefix.length() == 2 * pairs) {
            subsets.add(prefix);
            return subsets;
        }

        int left = prefix.replace(")", "").length();
        int right = prefix.replace("(", "").length();

        if (left < pairs) {
            subsets.addAll(validParentheses(prefix + "(", pairs));
        }
        if (right < left) {
            subsets.addAll(validParentheses(prefix + ")", pairs));
        }
        return subsets;
    }

}
