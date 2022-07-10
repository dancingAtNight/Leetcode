class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length == 0) return new int[2];
       
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(target - nums[i], i);
            }else{
                return new int[]{map.get(nums[i]), i};
            }
            }
        return new int[]{-1,-1};
    }
}