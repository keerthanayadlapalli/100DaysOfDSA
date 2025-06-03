import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {100, 4, 200, 1, 3, 2};
        int result = solution.longestConsecutive(nums);

        System.out.println("Longest consecutive sequence length: " + result);
    }
}

class Solution {
    public int longestConsecutive(int[] nums) {
        int N = nums.length;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < N; i++) {
            hs.add(nums[i]);
        }

        int max = 0;
        int count = 0;

        for (int num : hs) {
            // Check if it is the start of a sequence
            if (!hs.contains(num - 1)) {
                int currentNum = num;
                count = 1;

                while (hs.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                max = Math.max(max, count);
            }
        }

        return max;
    }
}
