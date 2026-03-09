class Solution {
    public int largestAltitude(int[] gain) {
       int max=0;
       int min=0;
       for(int g:gain){
        min+=g;
        if(min>max){
            max=min;
          }
       } 
       return max;
    }
} 