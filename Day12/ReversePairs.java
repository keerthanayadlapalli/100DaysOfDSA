public class ReversePairs {

    public int reversePairs(int[] nums) {
        return mergesort(nums, 0, nums.length - 1);
    }

    public int mergesort(int[] nums, int low, int high) {
        if (low >= high) {
            return 0;
        }
        int mid = (low + high) / 2;
        int count = 0;
        count += mergesort(nums, low, mid);
        count += mergesort(nums, mid + 1, high);
        count += countpairs(nums, low, mid, high);
        merge(nums, low, mid, high);
        return count;
    }

    public void merge(int[] nums, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        int[] temp = new int[high - low + 1];
        int k = 0;

        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp[k++] = nums[left++];
            } else {
                temp[k++] = nums[right++];
            }
        }

        while (left <= mid) {
            temp[k++] = nums[left++];
        }

        while (right <= high) {
            temp[k++] = nums[right++];
        }

        for (int i = low; i <= high; i++) {
            nums[i] = temp[i - low];
        }
    }

    public int countpairs(int[] nums, int low, int mid, int high) {
        int right = mid + 1;
        int count = 0;
        for (int i = low; i <= mid; i++) {
            while (right <= high && (long) nums[i] > 2L * nums[right]) {
                right++;
            }
            count += right - (mid + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        ReversePairs sol = new ReversePairs();
        int[] nums = {1, 3, 2, 3, 1};
        int result = sol.reversePairs(nums);
        System.out.println("Number of reverse pairs: " + result);
    }
}
