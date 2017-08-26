package recursion_2;

/**
 * Created by polarbear on 6/13/17.
 */
public class IfBlocks_Jul11 {
    public static void main(String[] a) {
        IfBlocks_Jul11 mySolution = new IfBlocks_Jul11();
        mySolution.ifBlocks(4);


    }

    public void ifBlocks(int n) {
        if (n < 1) {
            return;
        }
        ifBlocks(n, 0, n);

    }
    private void ifBlocks(int n, int level, int remaining) {
        if (level == n) {
            System.out.println("--------------");
            return;
        }
        for (int i = 1; i < remaining; i++) {
            StringBuilder spaces = new StringBuilder();
            for (int j = 0; j < 2*level; j++) {
                spaces.append(' ');
            }
            System.out.println(spaces.toString() + "if {");
                ifBlocks(n, level + 1, remaining - i);
            //print 2*level spaces here
            System.out.println(spaces.toString() + "}");

        }
    }

}
