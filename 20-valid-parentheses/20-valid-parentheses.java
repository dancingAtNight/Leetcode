class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if(s == null || s.length() == 0) {
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) =='[' ){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')'){
                if(!stack.empty() && stack.peek() != '('){
                    return false;
                  
                }else if(stack.empty()){
                    return false;

                }else if(stack.peek() == '('){
                    stack.pop();

                }
                
            }else if(s.charAt(i) == ']'){
                if(!stack.empty() && stack.peek() != '['){
                    return false;
                }else if(stack.empty()){
                    return false;
                }else if(stack.peek() == '['){
                    stack.pop();
                }
            }else{
                if(!stack.empty() && stack.peek() != '{'){
                    return false;
                    
                }else if(stack.empty()){
                    return false;}
                else if(stack.peek() == '{'){
                    stack.pop();
                    }
            }
        }
        
        
        if(stack.empty()){
            return true;
        }else{

            return false;
        }
        
    }
}