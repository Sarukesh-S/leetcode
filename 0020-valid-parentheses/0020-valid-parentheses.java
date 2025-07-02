class Solution {
    public boolean isValid(String s) {
        List<Character> lc=new ArrayList<>();
        for(char ch :s.toCharArray()){
            if(ch=='('||ch=='{'||ch=='['){
                lc.add(ch);
            }
            else{
                if(lc.isEmpty()) return false;
                char c=lc.get(lc.size()-1);
                if(ch==')'&& c!='('||ch=='}'&&c!='{'||ch==']'&&c!='['){
                    return false;
                }
                lc.remove(lc.size()-1);

            }
        }
        return lc.isEmpty();
    }
}