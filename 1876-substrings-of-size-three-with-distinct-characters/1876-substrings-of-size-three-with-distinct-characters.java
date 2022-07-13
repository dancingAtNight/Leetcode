class Solution {
    public int countGoodSubstrings(String str) {
         int count = 0;
        int counter;
    for(int i = 0; i <= str.length() - 3; i++){
            Set<Character> set = new HashSet<Character>();
            String s = str.substring(i, i + 3);
            counter = 0;
            for(char c : s.toCharArray()){
                if(set.add(c))
                    counter++;
                else
                    break;
            }
            if(counter == 3){
                count++;
            }
        }
        return count;
    }
        
    }
