class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> path = new ArrayList<>();
        backtrack(k, n, 0, 1, path);
        return res;
    }
    void backtrack(int k, int targetSum, int sum, int start, List<Integer> path){
        
        if( path.size() == k){
           if(sum == targetSum) res.add(new ArrayList<>(path));
            return;
            
        }
        for(int i = start; i <= 9; i++){
            
            sum+= i;
            path.add(i);
            backtrack(k, targetSum, sum, i +1,path);
            sum -= i;
            path.remove(path.size() -1);

        
        }

    
    }
}