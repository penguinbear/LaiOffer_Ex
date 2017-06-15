package hashtable_1;

import java.util.*;

/**
 * Created by polarbear on 6/13/17.
 */
public class KFrequent_Sol_1_Hashtable_PQ_Jun15 {
    public static void main(String[] a) {
        KFrequent_Sol_1_Hashtable_PQ_Jun15 mySubSets = new KFrequent_Sol_1_Hashtable_PQ_Jun15();
        String[] empty = new String[]{};

        String[] combo = new String[]{"a", "a", "b", "b", "b", "b", "c", "c", "c", "d"};

        System.out.println(Arrays.toString(mySubSets.topKFrequent(null, 2)));
        System.out.println(Arrays.toString(mySubSets.topKFrequent(empty, 2)));

        System.out.println(Arrays.toString(mySubSets.topKFrequent(combo, 5)));



    }

    public String[] topKFrequent(String[] combo, int k) {
        //Write your solution here.
        if (combo == null || combo.length == 0) {
            return new String[]{};
        }


        Hashtable<String, Integer> hash = new Hashtable<>();
        for (int i = 0; i < combo.length; i++) {
            if (hash.containsKey(combo[i])) {
                hash.put(combo[i], hash.get(combo[i]) + 1);
            } else {
                hash.put(combo[i], 1);
            }
        }

        Queue<Map.Entry<String, Integer>> heap = new PriorityQueue<>(k, new WordCountComparator<String, Integer>());
        for (Map.Entry entry : hash.entrySet()) {
            if (heap.size() < k) {
                heap.offer(entry);
            } else if (((Integer) entry.getValue()) > heap.peek().getValue()) {
                heap.poll();
                heap.offer(entry);
            }
        }

        String[] topK = new String[heap.size()];

        for (int i = topK.length - 1; i >= 0; i--) {
            topK[i] = heap.poll().getKey();
        }


        return topK;

    }

}

class WordCountComparator<K, V extends Comparable<V>> implements Comparator<Map.Entry<K, V>> {
    @Override
    public int compare(Map.Entry<K, V> e1, Map.Entry<K, V> e2) {
        if (e1.getValue() == e2.getValue()) {
            return 0;
        }

        //return e1.getValue() > e2.getValue() ? -1 : 1;
        return e1.getValue().compareTo(e2.getValue());
    }
}
