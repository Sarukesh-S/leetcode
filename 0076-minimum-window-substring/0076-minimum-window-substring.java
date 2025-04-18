class Solution {
    public String minWindow(String s, String t) {
        int [] hashArray=new int[256];
        for(int i=0; i<t.length();i++)
            hashArray[t.charAt(i)]++;
        int minLen=Integer.MAX_VALUE, count=0, startIndex=-1;
        int l=0,r=0;
        while(r<s.length()){
            if(hashArray[s.charAt(r)]>0)count++;
            hashArray[s.charAt(r)]--;
            while(count==t.length()){
                if(r-l+1 < minLen){
                    minLen=r-l+1;
                    startIndex=l;
                }
                hashArray[s.charAt(l)]++;
                if(hashArray[s.charAt(l)]>0)count--;
                l++;
            }
            r++;
        }
        return startIndex==-1?"":s.substring(startIndex,startIndex+minLen);
    }
}