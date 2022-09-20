class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        if(candidates.length == 0) return res;
        backtrack(candidates, 0, target, 0, temp, res);
        return res;
        
    }
    private void backtrack(int[] candidates, int start, int target, int sum, List<Integer> temp, List<List<Integer>> res){
        if(sum == target){
            res.add(new LinkedList<>(temp));
            return ;
        }
        if(sum > target){
            return;
        }
        for(int i = start; i < candidates.length; i++){
            temp.add(candidates[i]);
            sum += candidates[i];
            backtrack(candidates, i, target, sum, temp, res);
            sum -= candidates[i];
            temp.remove(temp.size() -1);

        }
    }
}