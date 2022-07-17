class Solution {
    public int romanToInt(String s) {
        int res = map(s.charAt(0));
        for(int i = 1; i < s.length(); i++){
           if(map(s.charAt(i)) > map(s.charAt(i-1))){
               res += map(s.charAt(i) )- 2 *map(s.charAt(i-1));
                } else{
               res += map(s.charAt(i));
           }
        }
        return res;
        
    }
    public static int map(char c){
        switch(c){
            case'I' :return 1;
            case'V' :return 5;
            case'X': return 10;
            case 'L': return 50;
            case'C' :return 100;
            case'D' :return 500;
            case'M': return 1000;
            default: return 0;
        }
    }
}