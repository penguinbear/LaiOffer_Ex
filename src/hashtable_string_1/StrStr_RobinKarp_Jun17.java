package hashtable_string_1;

/**
 * Created by polarbear on 6/13/17.
 */
public class StrStr_RobinKarp_Jun17 {
    public static void main(String[] a) {
        StrStr_RobinKarp_Jun17 mySubSets = new StrStr_RobinKarp_Jun17();
        /*
        System.out.println(mySubSets.strstr(null, ""));
        System.out.println(mySubSets.strstr(new String(), ""));



        System.out.println(mySubSets.strstr("aa", "bbb"));
        System.out.println(mySubSets.strstr("bcabc", "ab"));
        System.out.println(mySubSets.strstr("bcabc", "bcd"));
        System.out.println(mySubSets.strstr("abbb", ""));
        */
        System.out.println(mySubSets.strstr("abcdefghijklmnopqrstuvwxyzzabcdefghijklmnopqrstu", "qrstuvwxyzzabcdefghijklmnopqrstu"));



    }
    //how to resolve int overflow?
    public int strstr(String large, String small) {
        //Write your solution here.
        if (large == null || small == null || small.length() > large.length()) {
            return -1;
        }
        if (small == "") {
            return 0;
        }

        int range = 26; //assume only a ~ z allowed
        int smallSum = 0;
        int targetSum = 0;
        for (int i = small.length() - 1; i >= 0; i--) {
            smallSum += charValue(small.charAt(i)) * Math.pow(range, i);
            targetSum += charValue(large.charAt(i)) * Math.pow(range, i);

        }

        for (int i = 0; i < large.length() - small.length() + 1; i++) {
            if (smallSum == targetSum) {
                return i;
            } else if (small.length() + i < large.length()){    //not overflow the large string
                targetSum = targetSum / range + charValue(large.charAt(small.length() + i)) * (int)Math.pow(range, small.length() - 1);
            }
        }

        return -1;
    }

    private int charValue(char a) {
        return a - 'a';
    }


}
