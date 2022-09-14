class Solution {
    public boolean isValid(String s) {
        /*
            Time spent: 40 minutes
            TC: O(n) 
            SC: O(n)
        */
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> open = new HashMap<>();
        open.put(')', '(');
        open.put('}', '{');
        open.put(']', '[');
        if(s == null || s.length() == 0) {
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) =='[' ){
                stack.push(s.charAt(i));
            }
            else {
                // closing parenthesis: ), }, ]
                if(stack.empty() || stack.peek() != open.get(s.charAt(i))){
                    return false;
                }
                stack.pop();
                
            }
        }
        
        
        if(stack.empty()){
            return true;
        }else{

            return false;
        }
        
    }
}