import java.math.*;
import java.util.*;

public class AppendnDelete {

    public static String appendnDelete(String s, String t, int k) {

        int n = s.length();
        int m = t.length();
        int i = 0;

        if (n + m <= k)
            return "Yes";

        while (i < Math.min(n, m) && s.charAt(i) == t.charAt(i)) {
            i++;
        }
        int result = (n - i) + (m - i);

        if (result < k) {
            while (result < k) {
                result += 2;
                return (result == k) ? "Yes" : "No";
            }
        }
        return (result == k) ? "Yes" : "No";
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String s = scn.nextLine();
        String t = scn.nextLine();
        int k = scn.nextInt();

        String output = appendnDelete(s, t, k);

        System.out.println();
        System.out.println(output);
    }

}
