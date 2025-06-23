class Solution {
    public boolean isSubsequence(String s, String t) {
        int tin=0;
        int sin=0;
        while(tin<t.length() && sin<s.length()){
            if(s.charAt(sin)==t.charAt(tin))sin++;
            tin++;
        }
        return sin==s.length();
    }
}