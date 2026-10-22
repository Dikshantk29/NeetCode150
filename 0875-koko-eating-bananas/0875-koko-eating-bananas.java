
public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = maxValue(piles);
        int res = r;

        while (l <= r) {
            int k = l + (r - l) / 2;
            long totalHours = 0;

            for (int i = 0; i < piles.length; i++) {
                totalHours += Math.ceil((double) piles[i] / k);
            }

            if (totalHours <= h) {
                res = k;
                r = k - 1;
            } else {
                l = k + 1;
            }
        }

        return res;
    }

    static int maxValue(int[] piles) {
        int max = piles[0];

        for (int i = 1; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }

        return max;
    }
}
