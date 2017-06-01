/**
 * Created by vincenthu on 6/1/17.
 */
public class Fibonacci_Jun01 {

    public static void main(String[] a) {
        System.out.println(fibonacci(100));
        System.out.println(fibonacci(-10));
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));




    }

    public static long fibonacci(int K) {
        // Write your solution here
        if(K <= 0) {
            return 0;
        }
        if(K == 1 || K == 2) {
            return 1;
        }

        long[] fibonacci = new long[K];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        int i = 2;
        while(i < K) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            i++;
        }
        //to do: overflow of Long.MAX_VALUE needs to be handled -> BigInteger
        return fibonacci[K-1];

    }
    //overflow of Long.MAX_VALUE needs to be handled -> BigInteger
    //return fibonacci(K-2) + fibonacci(K-1);


}
