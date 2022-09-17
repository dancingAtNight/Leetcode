class Solution {
    public boolean checkValidString(String s) {
        if(s == null || s.length() == 0) return false;
        Stack<Integer> left = new Stack<>();
        Stack<Integer> star = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                left.push(i);
                
                
            }else if(ch == '*'){
                star.push(i);
                
                
            }else{
                if(!left.isEmpty()){
                    left.pop();
                }else if(!star.isEmpty()){
                    star.pop();
                }else{
                    return false;
                }
            }
        }
        
        while(!left.isEmpty() && !star.isEmpty()){
            int l = left.pop();
            int st = star.pop();
            if(l > st){
                return false;
                
            }
            
            
        }    
        if(!left.isEmpty()){
            return false;
        }
        return true;
        
    }
    
   
}