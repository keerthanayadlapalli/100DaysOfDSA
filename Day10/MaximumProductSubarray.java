package Day10;
class Solution {
    public int MaximumProductSubarray(int[] nums) {
        int N = nums.length;
        int max = nums[0];
        int min = nums[0];
        int maxproduct = nums[0];
        for (int i = 1; i < N; i++) {
            int temp = max;
            max = Math.max(nums[i], Math.max(max * nums[i], min * nums[i]));
            min = Math.min(nums[i], Math.min(min * nums[i], temp * nums[i]));
            maxproduct = Math.max(max, maxproduct);
        }
        return maxproduct;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {2, 3, -2, 4}; // Example input
        int result = solution.MaximumProductSubarray(nums);

        System.out.println("Maximum product subarray: " + result);
    }
}
