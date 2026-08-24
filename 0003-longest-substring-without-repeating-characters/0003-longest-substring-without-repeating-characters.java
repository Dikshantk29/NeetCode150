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
        // int maxLength =0;
        // for(int i=0;i<s.length();i++){
        //     Set<Character> seen = new HashSet<>();

        //     for(int j=i;j<s.length();j++){
        //         if(seen.contains(s.charAt(j))){
        //             break;
        //         }
        //         seen.add(s.charAt(j));

        //         // maxLength = Math.max(seen.size(),maxLength)
        //          maxLength = Math.max(j-1+1,maxLength);;
        //     }
        // }

        // return maxLength;

    }
}