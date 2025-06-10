public class SetMatch {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        int[] nums = {1, 2, 2, 4}; // Example input: 2 is duplicated, 3 is missing
        int[] result = sol.findErrorNums(nums);
        
        System.out.println("Duplicate: " + result[0]);
        System.out.println("Missing: " + result[1]);
    }
}

class Solution {
    public int[] findErrorNums(int[] nums) {
        int N = nums.length;
        long s = 0;
        long sn = (long)(N * (N + 1)) / 2;
        long s2 = 0;
        long sn2 = (long)(N * (N + 1) * (2L * N + 1)) / 6;
        
        for (int i = 0; i < N; i++) {
            s += nums[i];
            s2 += (long)nums[i] * nums[i];
        }
        
        long val1 = s - sn;         // x - y
        long val2 = s2 - sn2;       // x^2 - y^2
        long x = val2 / val1;       // x + y
        long y = (val1 + x) / 2;    // x
        long z = y - val1;          // y
        
        return new int[]{(int)y, (int)z};
    }
}
