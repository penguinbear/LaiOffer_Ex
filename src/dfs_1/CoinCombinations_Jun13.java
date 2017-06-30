package dfs_1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by polarbear on 6/13/17.
 */
public class CoinCombinations_Jun13 {
    public static void main(String[] a) {
        CoinCombinations_Jun13 mySubSets = new CoinCombinations_Jun13();
        //System.out.println(mySubSets.combinations(0, new int[]{25,2, 1}));

        //System.out.println(mySubSets.combinations(0, new int[]{10, 5, 2, 1}));
        //System.out.println(mySubSets.combinations(4, new int[]{10, 5, 2, 1}));

        System.out.println(mySubSets.combinations(11, new int[]{5, 2, 1}));

    }

    public List<List<Integer>> combinations(int target, int[] coins) {
        //Write your solution here.
        List<List<Integer>> result = new ArrayList<>();
        if (target == 0) {
            List<Integer> zeros =new ArrayList<Integer>();
            for (int i = 0; i < coins.length; i++) {
                zeros.add(0);
            }
            result.add(zeros);
            return result;
        }

        combinations(new ArrayList<Integer>(), target, coins, 0, result);
        return result;
    }

    private void combinations(List<Integer> determined, int remaining, int[] coins, int currentCoinIndex, List<List<Integer>> result) {

        if (remaining == 0) {
            result.add(new ArrayList<Integer>(determined));
            return;
        } else if (currentCoinIndex == coins.length) {
            return;
        }

        //for (int i = remaining / coins[currentCoinIndex]; i >= 0; i--) {
        for (int i = 0; i <= remaining / coins[currentCoinIndex]; i++) {

                determined.add(i);
            combinations(determined, remaining - i * coins[currentCoinIndex], coins, currentCoinIndex + 1, result);
            determined.remove(determined.size() - 1);
        }


    }


}
