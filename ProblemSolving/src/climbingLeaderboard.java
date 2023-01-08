import java.util.*;

public class climbingLeaderboard {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();

        List<Integer> scores = new ArrayList<Integer>();
        for (int i = 0; i < a; i++) {
            int score = scn.nextInt();
            if (scores.size() == 0 || scores.get(scores.size() - 1) != score)
                scores.add(score);
        }

        int b = scn.nextInt();
        for (int i = 0; i < b; i++) {
            int score = scn.nextInt();

            int min = 0;
            int max = scores.size();
            while (max > min) {
                int mid = (max + min) / 2;

                if (scores.get(mid) <= score)
                    max = mid;
                else
                    min = mid + 1;

            }

            System.out.println(min + 1);
        }

    }
}
