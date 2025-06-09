package Day13;

class countInversions {

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        int result = inversionCount(arr);
        System.out.println("Number of inversions: " + result);
    }

    // Function to count inversions in the array.
    public static int inversionCount(int arr[]) {
        return mergesort(arr, 0, arr.length - 1);
    }

    public static int mergesort(int[] arr, int low, int high) {
        if (low >= high) {
            return 0;
        }
        int mid = (low + high) / 2;
        int count = 0;
        count += mergesort(arr, low, mid);
        count += mergesort(arr, mid + 1, high);
        count += inversion(arr, low, mid, high);
        merge(arr, low, mid, high);
        return count;
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        int[] temp = new int[high - low + 1];
        int k = 0;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
            }
        }
        while (left <= mid) {
            temp[k++] = arr[left++];
        }
        while (right <= high) {
            temp[k++] = arr[right++];
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }
    }

    public static int inversion(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        int count = 0;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                left++;
            } else {
                count += (mid - left + 1);
                right++;
            }
        }
        return count;
    }
}

