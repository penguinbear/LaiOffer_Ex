package string_ii;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by polarbear on 6/13/17.
 */
public class AllAnagrams_Jul03 {
    public static void main(String[] a) {
        AllAnagrams_Jul03 mySubSets = new AllAnagrams_Jul03();
        /*
        System.out.println(mySubSets.strstr(null, ""));
        System.out.println(mySubSets.strstr(new String(), ""));



        System.out.println(mySubSets.strstr("aa", "bbb"));
        System.out.println(mySubSets.strstr("bcabc", "ab"));
        System.out.println(mySubSets.strstr("bcabc", "bcd"));
        System.out.println(mySubSets.strstr("abbb", ""));
        */
        System.out.println(mySubSets.allAnagrams("abcbac", "ab"));



    }
    //how to resolve int overflow?
    public List<Integer> allAnagrams(String s, String l) {
        //Write your solution here.
        List<Integer> results = new ArrayList<>();
        if (s == null || l == null | s.length() == 0 || l.length() == 0) {
            return results;
        }
        if (l.length() > s.length()) {
            return results;
        }

        int lSum = 0;
        for (char c : l.toCharArray()) {
            lSum += c;
        }

        int sSum = 0;
        for (int i = 0; i < s.length() - l.length(); i++) {
            if (i == 0) {
                for (int j = 0; j < l.length(); j++) {
                    sSum += s.charAt(i + j);
                }
            } else {
                sSum -= s.charAt(i - 1);
                sSum += s.charAt(i + l.length() - 1);
            }

            if (sSum == lSum) {
                boolean matched = true;
                for (int j = 0; j < l.length(); j++) {
                    if (s.charAt(i + j) != l.charAt(j)) {
                        matched = false;
                        break;
                    }
                }
                if (matched) {
                    results.add(i);
                }
            }
        }

        return results;
    }


}
