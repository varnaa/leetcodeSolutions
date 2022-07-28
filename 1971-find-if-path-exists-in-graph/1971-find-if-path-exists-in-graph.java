class Solution {
    private Set<Integer> visited = new HashSet<>();
    public boolean validPath(int n, int[][] edges, int start, int end) {
        if(n == 0){
            return false;
        }
        
        HashMap<Integer,Set<Integer>> graph = new HashMap<>();
        for(int i=0; i<n; i++){
            graph.put(i, new HashSet<>());
        }
        
        for(int[] edge: edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        visited.add(start);
        return depthFirstSearch(graph, start, end);
    }
    
    private boolean depthFirstSearch(HashMap<Integer,Set<Integer>> graph, int start, int end){
        if(start == end){
            return true;
        }else{
            for(int node:graph.get(start)){
                if(!visited.contains(node)){
                    visited.add(node);
                    boolean isPathAvailable = depthFirstSearch(graph,node,end);
                    if(isPathAvailable) return true;
                   // else visited.remove(node);
                }
            }
        }
        
        return false;
    }
}