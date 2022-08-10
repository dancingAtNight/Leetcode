class Solution {
    List<List<Integer>> res = new ArrayList<>();
 
    public List<List<Integer>> combine(int n, int k) {
       // if(k <= 0 || n <= 0) return res;
        List<Integer> path = new ArrayList<>();
        backtrack(n, k,path, 1);
        return res;
        
    }
    
    
    public void backtrack(int n, int k, List<Integer> path, int start){
        if(path.size() == k){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i = start; i <= n-(k - path.size()) + 1; i++){
            path.add(i);
            backtrack(n, k,path, i+1);
           path.remove(path.size() -1);
        }
        
    }
}