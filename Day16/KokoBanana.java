package Day16;
public class KokoBanana {

    static class Solution {
        public int minEatingSpeed(int[] piles, int h) {
            int max = piles[0];
            int N = piles.length;
            for (int i = 1; i < N; i++) {
                if (piles[i] > max) {
                    max = piles[i];
                }
            }

            int low = 1;
            int high = max;

            while (low <= high) {
                int mid = low + (high - low) / 2;
                long x = reqTime(piles, mid);
                if (x <= h) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return low;
        }

        public long reqTime(int[] arr, int speed) {
            long sum = 0;
            for (int i = 0; i < arr.length; i++) {
                long time = ((long) arr[i] + speed - 1) / speed;
                sum += time;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] piles = {3, 6, 7, 11};
        int h = 8;

        int minSpeed = sol.minEatingSpeed(piles, h);
        System.out.println("Minimum eating speed: " + minSpeed);
    }
}
