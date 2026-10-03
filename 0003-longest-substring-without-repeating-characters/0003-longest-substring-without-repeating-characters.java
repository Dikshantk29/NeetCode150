class Solution {
    public int lengthOfLongestSubstring(String s) {

        int l = 0;
        int res = 0;
        int n = s.length();

        HashSet<Character> seen = new HashSet<>();

        for (int r = 0; r < n; r++) {
            while (seen.contains(s.charAt(r))) {
                seen.remove(s.charAt(l));
                l++;
            }
            seen.add(s.charAt(r));
            res = Math.max(res, r - l + 1);
        }

        return res;
       
    }
}