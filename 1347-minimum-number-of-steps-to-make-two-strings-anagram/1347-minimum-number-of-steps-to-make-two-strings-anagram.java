class Solution {
       public int minSteps(String s, String t) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); ++i) {
            ++count[s.charAt(i) - 'a']; // count the occurrences of chars in s.
            --count[t.charAt(i) - 'a']; // compute the difference between s and t.
        }
     // return Arrays.stream(count).map(Math::abs).sum() / 2; // sum the absolute of difference and divide it by 2.
     // return Arrays.stream(count).filter(i -> i > 0).sum(); // sum the positive values.
        int steps = 0;
        for (int step : count) {
            if (step > 0) {
                steps += step;
            }
        }
	    return steps;
    }
}

/*
map = {b: 2, a: 1}
map2 = {b: 1, a:2}
---> map = {b: 1, a: -1}



map = {l: 1, e: 3, t: 1, c : 1, o: 1, d:1}

map2= {p: 1, r: 1, a: 1, c: 2, t: 1, i: 1, e:1}




--> p, r, a, i ,c



*/