class Solution {
    public boolean checkValidString(String s) {
        
               /*
               time complexcity --0(n) + O(n) 
               space : O(m + n) m is the size of left stack(the number of left parenthesis) and n is the size of the star stack(the number of star)
                
                
                Feedback:
                --- never explain complexity by saying it's not n^2 and not log(n) so it's O(n)
                -- 
                
               */
        if(s == null || s.length() == 0) return false;
        Stack<Integer> left = new Stack<>();
        Stack<Integer> star = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                left.push(i);
            }else if(s.charAt(i) == '*'){
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
        /*
        s = "((*()" false
        left = (0,1), star = (2);
        
        s = "((*)" true
        left = (0), start = (2)
        
        s = "(*()" true
        left = (0), star = (1)
        
        s  = "***((("
        left = (3,4,5) star = (0,1,2);
            
            left.size() == star.size()
            
            left.size() < star.size()
            
            
            left.size() > star.size()
            
            1. left and star are both empty
                True
            2. left is empty and star not empty
                True
            3. left not empty and star is empty
                False
        */
        
        while(!left.isEmpty() && !star.isEmpty()){
            int l = left.pop();
            int r = star.pop();
            if(l > r){
                return false;
            }
        }
        
        /*
        s =  "(((***"
        left = (0,1,2)
        
        s = "((*"
        left = (0,1) star = (2)
        
        s  = "()*"
        
         
        
        */
       if(!left.isEmpty() && star.isEmpty())
          return false;
      return true;
}
        
        // --- 
        // if s = "((*)"  left = (0) star = (2)       
        
    }

