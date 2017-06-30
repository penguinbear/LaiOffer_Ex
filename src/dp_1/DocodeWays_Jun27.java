package dp_1;

/**
 * Created by polarbear on 6/13/17.
 */
public class DocodeWays_Jun27 {
    public static void main(String[] a) {//
        DocodeWays_Jun27 mySolution = new DocodeWays_Jun27();
        System.out.println(mySolution.numDecodeWay(null));
        System.out.println(mySolution.numDecodeWay(""));
        System.out.println(mySolution.numDecodeWay("21251"));

        System.out.println(mySolution.numDecodeWay("10012"));
        System.out.println(mySolution.numDecodeWay("1012"));


    }
    public int numDecodeWay(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        if (s.length() == 1) {
            return 1;
        }
        int[] decodeWays = new int[s.length() + 1];
        decodeWays[1] = 1;

        int tmp = Integer.valueOf(s.substring(0, 2));

        if (tmp < 10) {
            return 0;
        }

        if (tmp > 26 || tmp == 10 || tmp == 20) {
            decodeWays[2] = 1;
        } else {
            decodeWays[2] = 2;
        }

        for (int i = 3; i < decodeWays.length; i++) {
            tmp = Integer.valueOf(s.substring(i - 2, i));
            if (tmp < 1) {
                return 0;
            }
            decodeWays[i] = decodeWays[i - 1];
            if (tmp > 10 && tmp < 27 && tmp != 20) {
                decodeWays[i] += decodeWays[i - 2];
            }
        }

        return decodeWays[s.length()];

    }



}
