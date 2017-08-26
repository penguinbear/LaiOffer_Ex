package final_exam;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Created by polarbear on 6/13/17.
 */
public class ValidParenthesesWithPriorities_Aug09 {
    public static void main(String[] a) {
        ValidParenthesesWithPriorities_Aug09 mySubSets = new ValidParenthesesWithPriorities_Aug09();
        System.out.println(mySubSets.validParentheses(1, 2, -1));
        System.out.println(mySubSets.validParentheses(0, 0, 0));
        System.out.println(mySubSets.validParentheses(1,1, 1));
        System.out.println(mySubSets.validParentheses(2, 2,2));
        System.out.println(mySubSets.validParentheses(2, 2,2).size());



    }

    public List<String> validParentheses(int l, int m, int n) {
        //Write your solution here.
        List<String> result = new ArrayList<>();
        if (l < 0 || m < 0 || n < 0) {
            return result;
        }

        char[] parentheses = new char[]{'(',')','[',']','{','}'};
        int[] remaining = new int[]{l, l, m, m, n, n};
        int totalLength = 2 * (l + m + n);
        char[] solu = new char[totalLength];

        Deque<Character> stack = new ArrayDeque<>();
        validParenthesesHelper(parentheses, remaining, 0, stack, solu, result);
        return result;

    }

    private void validParenthesesHelper(char[] parentheses, int[] remaining, int index, Deque<Character> stack, char[] solu, List<String> result) {
        if (index == solu.length) {
            result.add(new String(solu));
            return;
        }

        for (int i = 0; i < parentheses.length; i++) {
            if (i % 2 == 0 && remaining[i] > 0) {
                if (stack.isEmpty() || stack.peek() > parentheses[i]) {
                    remaining[i]--;
                    solu[index] = parentheses[i];
                    stack.push(solu[index]);
                    validParenthesesHelper(parentheses, remaining, index + 1, stack, solu, result);
                    stack.pop();
                    remaining[i]++;
                }
            } else if (!stack.isEmpty()) {
                if (remaining[i] > 0 && stack.peek() == parentheses[i - 1]) {
                    remaining[i]--;
                    stack.pop();
                    solu[index] = parentheses[i];
                    validParenthesesHelper(parentheses, remaining, index + 1, stack, solu, result);
                    stack.push(parentheses[i - 1]);
                    remaining[i]++;
                }
            }
        }
    }

}
