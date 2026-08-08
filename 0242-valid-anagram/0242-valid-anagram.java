class Solution {
    public boolean isAnagram(String s, String t) {
        //Brute-Force - sort and check match
        //better - HashMap for both String  check each charater  count compare
        //optimal - HashTable

        int[] count = new int[26];

         if(s.length() != t.length()){
            return false;
         }

        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }

        for(int x :count){
            if( x != 0 ){
                return false;
            }
        }

        return true;
    }
}