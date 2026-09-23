class Solution {
    public boolean isAnagram(String s, String t) {
       int []fr1=new int[26];
       int []fr2=new int[26];
       for(char c:s.toCharArray()){
        fr1[c-'a']++;
       }for(char c:t.toCharArray()){
        fr2[c-'a']++;
       }return Arrays.toString(fr1).equals(Arrays.toString(fr2));
    }
}
