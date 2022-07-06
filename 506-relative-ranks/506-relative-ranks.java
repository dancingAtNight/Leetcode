class Solution {
    public String[] findRelativeRanks(int[] score) {
     int len = score.length;
        int[] temp = new int[len];
        for (int i = 0; i < len; i++) {
            temp[i] = score[i];
        }
        Arrays.sort(temp);

        HashMap<Integer, String> map = new HashMap<>();

        for (int i = len - 1; i >= 0; i--) {
            if (i == len - 1) {
                map.put(temp[i], "Gold Medal");
            } else if (i == len - 2) {
                map.put(temp[i], "Silver Medal");
            } else if (i == len - 3) {
                map.put(temp[i], "Bronze Medal");
            } else {
                map.put(temp[i], String.valueOf(len - i));
            }
        }
        System.out.println(map);
        String[] res = new String[len];
        for (int i = 0; i < len; i++) {
            res[i] = map.get(score[i]);
        }
        return res;
        
    }
}