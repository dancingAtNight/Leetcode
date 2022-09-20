class Solution {
    
    /*TC: o( 2 ^n * 2) ---the generate operation is 2 ^ n and the valid-check is 2 ^ n
    SC: o (n) -- the size of the stack is decided by the number of pairs 
    
    */
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        char[] current = new char[2 * n];
        generate(current, 0, ans);
        return ans;
        
    }
    //)()(()
  public void generate(char[] current, int i, List<String> res){
      if(i == current.length){
          if(valid(current)){
              res.add(new String(current));
          }
      }else{
          current[i] = '(';
          generate(current, i + 1, res);
          current[i] = ')';
          generate(current, i + 1, res);
          
          
      }
  }
    
    public boolean valid(char[] current){ //2 ^n 
      int ans = 0;
      for(char ch: current){
          if(ch == '('){
              ans++;
              
          }else{
              ans--;
          }
          if(ans < 0){
              return false;
          }
      }
      return ans==0;
        
    }
}