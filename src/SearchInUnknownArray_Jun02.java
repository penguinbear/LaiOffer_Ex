/**
 * Created by vincenthu on 6/2/17.
 */

class Dictionary {
    int[] data = {1, 2, 5, 9, 12, 25, 78, 100};
    public Integer get(int index) {
        if (index > data.length - 1) {
            return null;
        }
        return data[index];
    }
}

public class SearchInUnknownArray_Jun02 {



    public static void main(String[] a) {
        Dictionary dict = new Dictionary();
        SearchInUnknownArray_Jun02 mySearch = new SearchInUnknownArray_Jun02();
        System.out.println(mySearch.search(dict, 5));
        System.out.println(mySearch.search(dict, 100));
        System.out.println(mySearch.search(null, 5));



    }

    public int search(Dictionary dict, int target) {
        // Write your solution here
        if (dict == null) {
            return -1;
        }

        int upper_bound = 1;
        while(dict.get(upper_bound) != null) {

            if(target == dict.get(upper_bound)) {
                return upper_bound;
            }else if(target < dict.get(upper_bound)) {
                break;
            }
            upper_bound *= 2;
        }

        int start = upper_bound/2;
        int end = upper_bound;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if (dict.get(mid) == null) {
                end = mid - 1;
            } else {
                int mid_data = dict.get(mid);
                if(mid_data == target) {
                    return mid;
                } else if(mid_data < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            }
        }

        return -1;
    }

}
