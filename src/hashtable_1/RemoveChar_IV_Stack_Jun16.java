package hashtable_1;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by polarbear on 6/13/17.
 */
public class RemoveChar_IV_Stack_Jun16 {
    public static void main(String[] a) {
        RemoveChar_IV_Stack_Jun16 mySubSets = new RemoveChar_IV_Stack_Jun16();
        System.out.println(mySubSets.deDup(null));
        System.out.println(mySubSets.deDup(new String()));


        System.out.println(mySubSets.deDup("aaaabbccbaac"));


    }

    public String deDup(String input) {
        //Write your solution here.
        if (input == null || input.length() < 2) {
            return input;
        }

        Deque<Character> stack = new ArrayDeque<>();
        stack.push(input.charAt(0));
        int curr = 1;
        while (curr < input.length()) {
            Character currentChar = input.charAt(curr);
            if (currentChar != stack.peek()) {
                stack.push(currentChar);
            } else if (curr == input.length() - 1){
                stack.pop();
            } else if (input.charAt(curr + 1) != stack.peek()) {
                stack.pop();
                //
            }
        }


        return input;
    }


}
