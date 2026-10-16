class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        res = new ArrayList<>();
        List<Integer> cmb = new ArrayList<>();

        backtrack(candidates, target, cmb, 0);

        return res;

    }

    public void backtrack(int[] candidates, int target, List<Integer> cmb, int i ){

        if(target == 0){
            res.add(new ArrayList<>(cmb));
            return;
        }
        if(target < 0 || i >= candidates.length){
            return;
        }
        cmb.add(candidates[i]);
        backtrack(candidates, target-candidates[i], cmb, i);
        cmb.remove(cmb.size()-1);
        backtrack(candidates, target, cmb, i+1);
    }

}