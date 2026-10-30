class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>map=new HashSet<>();
          int l=0;
          int r=0;
          int count=0;
          while(r<s.length()){
           while(map.contains(s.charAt(r))){
                map.remove(s.charAt(l));
                l++;
            }map.add(s.charAt(r));
         count=Math.max(count,r-l+1);     
         r++;  
          }
          return count;
    }
}
