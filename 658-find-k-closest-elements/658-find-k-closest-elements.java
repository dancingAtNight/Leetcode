class Solution {
    public List<Integer> findClosestElements(int[] nums, int k, int x) {
        List<Integer> arr = new ArrayList<>();
        for(int num: nums){
            arr.add(num);
        }
        Collections.sort(arr, (a, b) -> Math.abs(a - x) - Math.abs(b-x));
        
        arr = arr.subList(0, k);
        Collections.sort(arr);
        return arr;
        
    }
}