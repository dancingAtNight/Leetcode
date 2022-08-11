class Solution {
    public String multiply(String num1, String num2) {
        //最长的只能是num1.length + num2.length;
        if(num1 == "0" || num2 == "0") return "0";
        int len1 = num1.length();
        int len2 = num2.length();
        int[] res= new int[len1 + len2];
        for(int i = len1 - 1; i >= 0; i--){
            for(int j = len2 -1; j >= 0; j--){
                int product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j + 1, p2 = i + j;
                product  += res[p1];
                res[p1] = product % 10;
                res[p2] += product /10;
                
            }    
    }
        StringBuilder sb = new StringBuilder();
      int i = 0;
        while(i < res.length && res[i] == 0){
            i++;
        }
        while(i < res.length){
            sb.append(res[i]);
            i++;

        }
        
        return sb.length() == 0? "0": sb.toString();
}
}