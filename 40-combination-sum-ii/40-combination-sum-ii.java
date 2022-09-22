class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[candidates.length];
        backtracking(candidates, 0, target, 0, temp, res, used);
        return res;
        
    }
    private void backtracking(int[] candidates, int startIdx, int target, int sum, List<Integer> temp, List<List<Integer>> res, boolean[] used){
        if(sum == target){
            res.add(new ArrayList<>(temp));
            return;

        }if(sum > target){
            return;

        }
        Arrays.sort(candidates);
        for(int i = startIdx; i < candidates.length ; i++){
            if( i > 0 && candidates[i] == candidates[i-1] && used[i-1] == false){
                    continue;
            }
            sum += candidates[i];
            temp.add(candidates[i]);
            used[i] = true;
            backtracking(candidates, i + 1, target, sum, temp, res, used);
            used[i] = false;
            sum -= candidates[i];
            temp.remove(temp.size() -1);

        }
    }
}