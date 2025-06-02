package Day06;
import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int N = nums.length;
        int ele1 = -1;
        int ele2 = -1;
        int f1 = 0;
        int f2 = 0;

        // First pass: Find potential candidates
        for (int i = 0; i < N; i++) {
            if (nums[i] == ele1) {
                f1++;
            } else if (nums[i] == ele2) {
                f2++;
            } else if (f1 == 0) {
                ele1 = nums[i];
                f1 = 1;
            } else if (f2 == 0) {
                ele2 = nums[i];
                f2 = 1;
            } else {
                f1--;
                f2--;
            }
        }

        // Second pass: Verify counts
        f1 = 0;
        f2 = 0;
        for (int i = 0; i < N; i++) {
            if (nums[i] == ele1) {
                f1++;
            }
            if (nums[i] == ele2) {
                f2++;
            }
        }

        if (f1 > N / 3) {
            list.add(ele1);
        }
        if (f2 > N / 3 && ele1 != ele2) {
            list.add(ele2);
        }

        return list;
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {3, 2, 3};
        List<Integer> result = sol.majorityElement(nums);
        System.out.println("Majority elements (> n/3 times): " + result);

        int[] nums2 = {1, 1, 1, 3, 3, 2, 2, 2};
        List<Integer> result2 = sol.majorityElement(nums2);
        System.out.println("Majority elements (> n/3 times): " + result2);
    }
}
