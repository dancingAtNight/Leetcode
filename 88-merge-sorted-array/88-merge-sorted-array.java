class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res= new int[m + n];
        int p1 = 0, p2 = 0, p3 = 0;
        while(p1 < m && p2 < n){
            if(nums1[p1] < nums2[p2]){
                res[p3] = nums1[p1];
                p1++;
            }else{
                res[p3] = nums2[p2];
                p2++;
            }
            p3++;
        }
        while(p1 < m){
            res[p3] = nums1[p1];
            p1++;
            p3++;
            
        }
        while(p2 < n){
            res[p3] = nums2[p2];
            p2++;
            p3++;
        }
        
        for(int i = 0; i < m+n; i++){
            nums1[i]= res[i];
        }
    }
}