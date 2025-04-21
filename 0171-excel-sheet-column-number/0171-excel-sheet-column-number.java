class Solution {
    public int titleToNumber(String columnTitle) {
        int sum=0;
        int val=0;
        if(columnTitle.length()==0) return -1;
        for(char c:columnTitle.toUpperCase().toCharArray()){
            sum*=26;
            val=1+(c-'A');
            sum+=val;

        }
        return sum;
    }
}