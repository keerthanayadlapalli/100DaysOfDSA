import java.util.*;

class rearrangeArrayElementsBySign{
    public int[] rearrangeArray(int[] nums) {
        int N = nums.length;
        int[] a = new int[N];
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            if (nums[i] > 0) {
                pos.add(nums[i]);
            } else {
                neg.add(nums[i]);
            }
        }

        if (pos.size() > neg.size()) {
            for (int i = 0; i < neg.size(); i++) {
                a[2 * i] = pos.get(i);
                a[2 * i + 1] = neg.get(i);
            }
            int index = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++) {
                a[index] = pos.get(i);
                index++;
            }
        } else if (pos.size() < neg.size()) {
            for (int i = 0; i < pos.size(); i++) {
                a[2 * i] = pos.get(i);
                a[2 * i + 1] = neg.get(i);
            }
            int index = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                a[index] = neg.get(i);
                index++;
            }
        } else {
            for (int i = 0; i < pos.size(); i++) {
                a[2 * i] = pos.get(i);
                a[2 * i + 1] = neg.get(i);
            }
        }

        return a;
    }

    public static void main(String[] args) {
        rearrangeArrayElementsBySign sol = new rearrangeArrayElementsBySign();
        int[] nums = {3, 1, -2, -5, 2, -4};
        int[] result = sol.rearrangeArray(nums);

        System.out.println("Rearranged Array:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
