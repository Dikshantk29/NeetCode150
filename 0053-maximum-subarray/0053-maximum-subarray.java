class Solution {
    public int maxSubArray(int[] nums) {

       int maxSalary = nums[0];
       int currSalary = nums[0];

       for(int i =1;i<nums.length;i++){
        currSalary = Math.max(nums[i], currSalary + nums[i]);
        maxSalary = Math.max(currSalary, maxSalary);
       }

       return maxSalary;

    }
}