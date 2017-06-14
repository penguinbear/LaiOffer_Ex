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
        System.out.println(mySubSets.combinations(4, new int[]{10, 5, 2, 1}));


    }

    public List<List<Integer>> combinations(int target, int[] coins) {
        //Write your solution here.
        List<List<Integer>> combinations = new ArrayList<>();
        if (target == 0) {
            List<Integer> zeros =new ArrayList<Integer>();
            for (int i = 0; i < coins.length; i++) {
                zeros.add(0);
            }
            combinations.add(zeros);
            return combinations;
        }

        return combinations(new ArrayList<Integer>(), target, coins, 0);
    }

    private List<List<Integer>> combinations(List<Integer> determined, int target, int[] coins, int currentCoinIndex) {        List<List<Integer>> combinations = new ArrayList<>();

        if (currentCoinIndex == coins.length) {
            return new ArrayList<>();
        }


        List<List<Integer>> solutions = new ArrayList<>();
        if (target == 0) {
            for (int i = currentCoinIndex; i < coins.length; i++) {
                determined.add(0);
            }
            solutions.add(determined);
            return solutions;
        }


        for (int i = target / coins[currentCoinIndex]; i >= 0; i--) {
            determined.add(i);
            solutions.addAll(combinations(determined, target - i * coins[currentCoinIndex], coins, currentCoinIndex + 1));
            determined.remove(determined.size() - 1);
        }
        return solutions;


    }


}
