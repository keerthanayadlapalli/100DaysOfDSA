package Day15;
public class PeakElement {

    static class Solution {
        public int findPeakElement(int[] nums) {
            int N = nums.length;
            int low = 1;
            int high = N - 2;
            int mid = 0;

            if (N == 1) {
                return 0;
            }
            if (nums[0] > nums[1]) {
                return 0;
            }
            if (nums[N - 1] > nums[N - 2]) {
                return N - 1;
            }

            while (low <= high) {
                mid = (high + low) / 2;

                if (nums[mid - 1] < nums[mid] && nums[mid + 1] < nums[mid]) {
                    return mid;
                } else if (nums[mid + 1] > nums[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            return mid;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {1, 2, 3, 1};  // Example test case
        int peakIndex = sol.findPeakElement(nums);

        System.out.println("Peak element is at index: " + peakIndex);
    }
}
