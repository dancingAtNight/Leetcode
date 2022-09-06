class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length -1;
        int res = 0;
        while(left < right){
            int curr = Math.min(height[left], height[right]) * (right - left);
            res = Math.max(res, curr);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }

        }
        return res;
        
        
    }
}