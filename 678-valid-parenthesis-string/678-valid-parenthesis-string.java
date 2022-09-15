class Solution {
    public boolean checkValidString(String s) {
        
               /*
                
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
       
      if(left.isEmpty() && star.isEmpty()){
          return true;

      }else if(!left.isEmpty() && star.isEmpty()){
          return false;

      }else{
          return true;
      }
}
        
        // --- 
        // if s = "((*)"  left = (0) star = (2)  
        
        
        
        
    }

