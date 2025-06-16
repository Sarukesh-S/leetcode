class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       Set<Integer> set=new HashSet<>();
       Set<Integer> set1=new HashSet<> ();
       for(int i:nums1){
        set.add(i);
       }
       for(int i:nums2){
        set1.add(i);
       }
       set.retainAll(set1);
       int arr[]=new int[set.size()];
       int ind=0;
       for(int i:set){
        arr[ind]=i;
        ind++;
       }
       return arr;
        
    }
}