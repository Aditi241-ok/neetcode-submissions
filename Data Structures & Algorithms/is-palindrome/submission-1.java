class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
         s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }return sb.toString().equals(s);
       
       /* int l=0;
        int r=s.length()-1;
while(l<=r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;r--;}
        
        return true;*/
        }
}
