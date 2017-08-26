package Jul_mid_term;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by polarbear on 6/3/17.
 */
public class ValidIfBlocks_Aug09 {

    public static void main(String[] a) {
        ValidIfBlocks_Aug09 mySolution = new ValidIfBlocks_Aug09();
        mySolution.validIfBlocks(2);
        //mySolution.validIfBlocks(3);
    }


    private void validIfBlocks(int pairs) {
        if (pairs < 1) {
            return;
        }
        validIfBlocksHelper(pairs, pairs, new ArrayList<Integer>());
    }

    private void validIfBlocksHelper(int left, int right, List<Integer> solu) {
        if (left == 0 && right == 0) {
            printResults(solu);
            return;
        }

        if (left > 0) {
            solu.add(1);
            validIfBlocksHelper(left - 1, right, solu);
            solu.remove(solu.size() - 1);
        }

        if (right > left) {
            solu.add(0);
            validIfBlocksHelper(left, right - 1, solu);
            solu.remove(solu.size() - 1);
        }


    }

    private void printResults(List<Integer> solu) {
        int heading = 0;
        for (Integer i : solu) {
            if (i == 1) {
                printHeading(heading);
                System.out.println("if {");
                heading++;
            } else {
                printHeading(heading);
                System.out.println("}");
                heading--;
            }
        }
        System.out.println("----------------------------");
    }
    private void printHeading(int heading) {
        for (int  i = 0; i < heading; i++) {
            System.out.print("  ");
        }
    }
}