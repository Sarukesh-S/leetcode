class Solution {
    public int lengthOfLongestSubstring(String s) {
           int start = 0 ;
        int end = 0 ;
        int maxLength = 0 ;

        Set<Character> charset = new HashSet<>() ;

        while(end < s.length())
        {
            if(!charset.contains(s.charAt(end)))
            {
                charset.add(s.charAt(end));
                end++ ;
                maxLength = Math.max(maxLength , charset.size());
            }else{
                charset.remove(s.charAt(start));
                start++;
            }
        }

        return maxLength ;
    }
}