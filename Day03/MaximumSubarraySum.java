package Day03;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int []nums={-2,1,-3,4,-1,2,1,-5,4};
        int a =maxSubArray(nums);
        System.out.println(a);
    }
     public static int maxSubArray(int[] nums) {
       int N = nums.length;
       int max = Integer.MIN_VALUE;
       int start = -1;
       int ansStart = -1;
       int ansEnd = -1;
       int sum =0;
       for(int  i=0;i<N;i++){
        if(sum==0){
            start =i;
        }
        sum+=nums[i];
       if(sum>max){
        max = sum;
        ansStart = start;
        ansEnd =i;
       }
       if(sum<0){
        sum=0;
       }
       }
       for (int i = ansStart; i <= ansEnd; i++) {
        System.out.print(nums[i] + " ");
        }
        System.out.println();  // Add a newline after printing the subarray elements
        return max;
    }
}
