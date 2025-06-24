class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int a=0;
        int b=0;
        for(int i=0;i<nums.length;i++){
         a=nums[nums.length-1];
         b=nums[nums.length-2];
        //  break;
        }
        a=a-1;
        b=b-1;
        return a*b;
        
    }
}