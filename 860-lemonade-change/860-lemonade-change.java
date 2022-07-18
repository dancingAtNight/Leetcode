class Solution {
    public boolean lemonadeChange(int[] bills) {
        int Five = 0, Ten = 0;
        for(int bill: bills){
            if(bill == 5){
                Five++;
            }else if(bill == 10){
                if(Five == 0) return false;
                Ten++;
                Five--;
            }else{
                if(Five > 0 && Ten > 0){
                    Five--;
                    Ten--;
                }else if(Five >= 3){
                        Five -= 3;}
                else{
return false;
                }
            }
        }
        return true;
    }
}