public class SortColor {
    public void sortColors(int[] nums) {
        int N = nums.length;
        int low = 0;
        int mid = 0;
        int high = N - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                mid++;
                low++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        SortColor sol = new SortColor();
        int[] nums = {2, 0, 2, 1, 1, 0};

        System.out.println("Before sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        sol.sortColors(nums);

        System.out.println("\nAfter sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
