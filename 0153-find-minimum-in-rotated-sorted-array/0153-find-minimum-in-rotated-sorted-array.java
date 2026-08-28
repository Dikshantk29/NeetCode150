class Solution {
    public int findMin(int[] nums) {

        // //O(n) complexity
        // for (int i = 1; i < nums.length; i++) {
        //     if (nums[i - 1] > nums[i]) {
        //         return nums[i];
        //     }

        // }
        // return nums[0];

        //O( log n )
        int l = 0;
        int r = nums.length - 1;
        int res = Integer.MAX_VALUE;

        while (l <= r) {
            int m = l +(r-l)/2;
            if (nums[l] <= nums[m]) {
                res = Math.min(res, nums[l]);
                l = m+1;
            }else{
                 res = Math.min(res, nums[m]);
                 r=m-1;
            }
        }

        return res;

    }
}