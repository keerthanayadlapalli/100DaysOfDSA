package Day11;
import java.util.Arrays;

public class MergeSort {
    public int[] sortArray(int[] nums) {
        int N = nums.length;
        mergesort(nums, 0, N - 1);
        return nums;
    }

    public void mergesort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergesort(nums, low, mid);
        mergesort(nums, mid + 1, high);
        merge(nums, low, mid, high);
    }

    public void merge(int[] nums, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        int[] a = new int[high - low + 1];
        int k = 0;
        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                a[k++] = nums[left++];
            } else {
                a[k++] = nums[right++];
            }
        }
        while (left <= mid) {
            a[k++] = nums[left++];
        }
        while (right <= high) {
            a[k++] = nums[right++];
        }
        for (int i = low; i <= high; i++) {
            nums[i] = a[i - low];
        }
    }

    public static void main(String[] args) {
        MergeSort sol = new MergeSort();
        int[] nums = {5, 2, 3, 1, 4};
        int[] sorted = sol.sortArray(nums);
        System.out.println("Sorted Array: " + Arrays.toString(sorted));
    }
}
