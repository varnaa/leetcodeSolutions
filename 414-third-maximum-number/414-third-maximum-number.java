class Solution {
    public int thirdMax(int[] nums) {
        
        Arrays.sort(nums);
        int length = nums.length;
        
        if(length == 0){
            return -1;
        }else if(length == 1){
            return nums[0];
        }else if(length == 2){
            return nums[1];
        }
        
        int count = 0;
        for(int i=length-2; i>=0; i--){
            if(nums[i] != nums[i+1]){
                count++;
            }
            
            if(count == 2) return nums[i];
        }
        
        return nums[length-1];
    }
}