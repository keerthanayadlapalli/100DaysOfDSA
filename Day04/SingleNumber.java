package Day04;
class Solution {
    public int singleNumber(int[] nums) {
        int N = nums.length;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum ^= nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {4, 1, 2, 1, 2};  // Example input
        int result = solution.singleNumber(nums);
        System.out.println("The single number is: " + result);
    }
}
