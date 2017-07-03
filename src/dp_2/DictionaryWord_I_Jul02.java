package dp_2;

/**
 * Created by polarbear on 6/13/17.
 */
public class DictionaryWord_I_Jul02 {
    public static void main(String[] a) {//
        DictionaryWord_I_Jul02 mySolution = new DictionaryWord_I_Jul02();
        String[] dict = new String[]{"bob", "cat", "rob"};
        //System.out.println(mySolution.canBreak("robob", dict));
        System.out.println(mySolution.canBreak("robcatbob", dict));


    }
    public boolean canBreak(String input, String[] dict) {
        if (input == null || input.length() == 0 || dict == null || dict.length == 0) {
            return false;
        }

        boolean[] result = new boolean[input.length() + 1];
        result[0] = true;
        for (int i = 1; i < result.length; i++) {
            result[i] = false;
            for (int j = 0; j < i; j++) {
                if (result[j] && dictContains(input.substring(j, i), dict)) {
                    result[i] = true;
                    break;
                }

            }
        }

        return result[input.length()];

    }

    private boolean dictContains(String target, String[] dict) {
        if (target == null) {
            return false;
        }

        for (String word : dict) {
            if (word.equals(target)) {
                return true;
            }
        }

        return false;

    }



}
