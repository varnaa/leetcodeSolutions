class Solution {
    public boolean canBeIncreasing(int[] nums) {
        //base case
        if(nums == null || nums.length <= 1){
            return true;
        }
        
        int last_index=0;
        boolean removed=false;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[last_index]){
                if(removed) return false;
                if(i>1 && nums[i-2]>=nums[i]){
                    last_index=i-1;
                }else last_index=i;
                removed=true;
            }else last_index=i;
        }
        return true;
    }
}