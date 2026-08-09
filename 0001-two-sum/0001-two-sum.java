class Solution {
    public int[] twoSum(int[] nums, int target) {

        //brute force - two for loop 
        //better - sorting and two pointer
        //optimal - HashMap

        //HashMap<Value, Index>
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (map.containsKey(diff)) {
                return new int[] { map.get(diff), i };
            }

            map.put(num, i);
        }
        return new int[] { -1, -1 };

    }
}
