class Solution {
    public String simplifyPath(String path) {
        String[] parts = path.split("/");
        Stack<String> stack = new Stack<>();
        for(String part: parts){
            if(part.isEmpty() || part.equals(".")){
                continue;
            }
            if(part.equals("..")){
                if(!stack.isEmpty()) stack.pop();
                continue;
            }
            stack.push(part);
        }
        String res = "";
        while(!stack.isEmpty()){
            res = "/" + stack.pop() + res;
        }
        return res.isEmpty() ? "/": res;
        
    }
}