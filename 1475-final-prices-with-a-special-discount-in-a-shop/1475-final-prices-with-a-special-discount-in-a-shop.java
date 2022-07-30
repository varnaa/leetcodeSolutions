class Solution {
    public int[] finalPrices(int[] prices) {
        //base case 
        if(prices.length == 0){
            return prices;
        }
        
        Deque<Integer> stack = new ArrayDeque<>();
        stack.addFirst(0);
        int length = prices.length;
        
        for(int i=length - 1; i>=0; i--){
            int temp = prices[i];
            while(!stack.isEmpty() && stack.peekFirst() > prices[i]){
                stack.removeFirst();
            }
            prices[i]-=stack.peekFirst();
            stack.addFirst(temp);
        }
        
        return prices;
    }
}