class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        // base case 
        if(heights.length == 0){
            return heights;
        }
        
        Deque<Integer> stack = new ArrayDeque<>();
        int length = heights.length;
        int[] result = new int[length];
        
        for(int i=length -1; i>=0; i--){
            if(stack.isEmpty()){
                result[i] = 0;
                stack.addFirst(heights[i]);
            }else{
                while(!stack.isEmpty() && stack.peekFirst() < heights[i]){
                    result[i]++;
                    stack.removeFirst();
                }
                if(!stack.isEmpty()){
                    result[i]++;
                }
                stack.addFirst(heights[i]);
            }
        }
        
        return result;
    }
}