class Solution {
    public int minimumOperations(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        
        int[] sortedNumbs = nums.clone();
        Arrays.sort(sortedNumbs);
        int result = 0;
        
        
        while(allZeros(nums) != true){
            int index = 0;
            for(index=0; index<nums.length; index++){
                if(sortedNumbs[index] != 0) break;
            }
            if(index == nums.length) return result;
            for(int i=0; i<nums.length; i++){
                if(nums[i] == 0) continue;
                nums[i] = nums[i] - sortedNumbs[index]  < 0 ? 0 : nums[i] - sortedNumbs[index];
            }
            
            sortedNumbs = nums.clone();
            Arrays.sort(sortedNumbs);
            result++;
        }
        
        return result;
    }
    
    private boolean allZeros(int[] nums){
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                return false;
            }
        }
        return true;
    }
}