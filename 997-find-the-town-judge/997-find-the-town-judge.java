class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n == 0 || n == 1){
            return n==0 ? -1 : 1;
        }
        
        HashMap<Integer,int[]> degreeList = new HashMap<>();

        // [indegree, outdegree]
        for(int i=1; i<=n; i++){
            degreeList.put(i, new int[2]);
        }
        
        for(int[] edge: trust){
            degreeList.get(edge[0])[1]++;
            degreeList.get(edge[1])[0]++;
        }
        
        
        for(int i=1; i<=n; i++){
            int[] degrees = degreeList.get(i);
            if(degrees[0] == n -1. && degrees[1] == 0){
                return i;
            }
        }
        
        return -1;
    }
}

