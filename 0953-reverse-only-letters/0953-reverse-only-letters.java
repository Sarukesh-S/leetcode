class Solution {
    public String reverseOnlyLetters(String s) {
        char[]ch=s.toCharArray();
        int l=0;
        int r=ch.length-1;
        while(l<r){
            while(l<r&&!Character.isLetter(ch[l])){
                l++;
            }
            while(l<r&&!Character.isLetter(ch[r])){
                r--;
            }
            if(l<r){
                char temp=ch[l];
                ch[l]=ch[r];
                ch[r]=temp;
                l++;
                r--;
            }
        }
        return new String(ch);
    }
}