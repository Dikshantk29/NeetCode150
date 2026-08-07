class Solution {
    public boolean containsDuplicate(int[] nums) {
        //Brute Force - 2 for loop 
        //Better - Sorting
        //optimal - HashSet

        Set<Integer> seen = new HashSet<>();

        for(int x : nums){
            if(seen.contains(x)){
                return true;
            }
            seen.add(x);

        }
        return false;
    }
}