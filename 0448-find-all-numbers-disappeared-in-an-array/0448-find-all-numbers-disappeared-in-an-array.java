class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> hm=new HashSet<>();
        ArrayList<Integer> is=new ArrayList<>();
        for(int i:nums){
            hm.add(i);
        }
        for(int i=1;i<=nums.length;i++){
            if(!hm.contains(i)){
                is.add(i);

            }
            }return is;
        } 
    }