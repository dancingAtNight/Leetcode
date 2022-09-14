class Solution {
   public boolean checkValidString(String s) {
        Stack<Integer> leftStack = new Stack<>();
        Stack<Integer> starStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                leftStack.push(i);
            }
            else if (s.charAt(i) == ')') {
                if (!leftStack.isEmpty()) {
                    leftStack.pop();
                }
                else if (!starStack.isEmpty()) {
                    starStack.pop();
                }
                else {
                    return false;
                }
            }
            else {
                starStack.push(i);
            }
        }
        while (!leftStack.isEmpty() && !starStack.isEmpty()) {
            int li = leftStack.pop();
            int si = starStack.pop();
            if (si < li) {
                return false;
            }
        }
        if (!leftStack.isEmpty()) {
            return false;
        }
        return true;
    }   
    }
