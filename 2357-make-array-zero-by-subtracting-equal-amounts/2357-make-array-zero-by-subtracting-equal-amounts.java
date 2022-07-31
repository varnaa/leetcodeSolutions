class Solution {
    public int minimumOperations(int[] nums) {
        //base case
        if(nums.length == 0){
            return 0;
        }
        
        var set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0) continue;
            set.add(nums[i]);
        }
        
        return set.size();
    }
}