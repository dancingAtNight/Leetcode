class Solution {
    public List<List<Integer>> combine(int n, int k) {
    List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        backtrack(1, n, k, ans, res);
        return res;
        
    }
    void backtrack(int startIndex, int n, int k, List<Integer> temp, List<List<Integer>> res){
        if( temp.size() ==k ){
            res.add(new LinkedList<>(temp));
            return;
        }
        for(int i = startIndex; i <= n; i++){
            temp.add(i);
            backtrack(i + 1, n, k, temp, res);
            temp.remove(temp.size() -1);
        
              
        }
    }
}