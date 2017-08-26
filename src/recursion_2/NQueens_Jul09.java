package recursion_2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by polarbear on 6/13/17.
 */
public class NQueens_Jul09 {
    public static void main(String[] a) {
        NQueens_Jul09 mySolution = new NQueens_Jul09();
        System.out.println(mySolution.nqueens(5));


    }

    public List<List<Integer>> nqueens(int n) {
        // Write your solution here.
        if (n < 1) {
            return null;
        }
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> solu = new ArrayList<>();
        nqueens(n, solu, results);
        return results;
    }

    private void nqueens(int n, List<Integer> solu, List<List<Integer>> results) {
        if (solu.size() == n) {
            results.add(new ArrayList<Integer>(solu));
            return;
        }
        boolean[] occupied = new boolean[n];
        for (int i = 0; i < solu.size(); i++) {
            occupied[solu.get(i)] = true;
            if (solu.get(i) - (solu.size() - i) >= 0) {
                occupied[solu.get(i) - (solu.size() - i)] = true;
            }
            if (solu.get(i) + (solu.size() - i) <= n - 1) {
                occupied[solu.get(i) + (solu.size() - i)] = true;
            }

        }
        for (int i = 0; i < n; i++) {
            if (!occupied[i]) {
                solu.add(i);
                nqueens(n, solu, results);
                solu.remove(solu.size() - 1);

            }
        }

    }

}
