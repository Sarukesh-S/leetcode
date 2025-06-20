class Solution {

     public static boolean ispalin(String s2){
          int i=0;
          int j=s2.length()-1;
          while(i<j){
            if(s2.charAt(i)!=s2.charAt(j)){
            return false;}
            i++;
          j--;
          }  
          return true;
         }
     
    public String longestPalindrome(String s) {
         String s1="";
         for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String s2=s.substring(i,j+1);
                if(ispalin(s2) && s2.length() > s1.length()){
                  s1=s2;
                }
            }
         }
         return s1;
    }
     }
        
