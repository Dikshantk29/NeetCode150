class Solution {
    public boolean canJump(int[] nums) {
        int farthest = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > farthest) {
                return false;
            }

            farthest = Math.max(farthest, i + nums[i]);

            if (farthest >= nums.length - 1) {
                return true;
            }
        }

        return true;
    }
}
// class Solution {
//     public boolean canJump(int[] nums) {
//         return solve(nums, 0);
//     }

//     private boolean solve(int[] nums, int index) {
//         // Reached or crossed the last index
//         if (index >= nums.length - 1) {
//             return true;
//         }

//         // Cannot move forward
//         if (nums[index] == 0) {
//             return false;
//         }

//         // Try every possible jump
//         for (int jump = 1; jump <= nums[index]; jump++) {
//             if (solve(nums, index + jump)) {
//                 return true;
//             }
//         }

//         return false;
//     }
// }