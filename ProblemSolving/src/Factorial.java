import java.math.*;
import java.util.*;

public class Factorial {

    static void extraLongFactorials(int n) {
        BigInteger b = new BigInteger(String.valueOf(n));
        System.out.print(fact(b, n));
    }

    static BigInteger fact(BigInteger n, int t) {
        BigInteger result = new BigInteger(String.valueOf(1));
        for (int i = 1; i <= t; i++) {
            result = result.multiply(new BigInteger(String.valueOf(i)));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        scn.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        extraLongFactorials(n);
    }

}
