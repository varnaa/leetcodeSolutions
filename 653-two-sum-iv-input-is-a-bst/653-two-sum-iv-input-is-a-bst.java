/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private Set<Integer> set;
    public boolean findTarget(TreeNode root, int k) {
        this.set = new HashSet<>();
        return inorderTraversal(root, k);
    }
    
    private boolean inorderTraversal(TreeNode root, int k){
        if(root == null){
            return false;
        }
        
        boolean left = inorderTraversal(root.left, k);
        
        int difference = k - root.val;
        if(set.contains(difference)){
            return true;
        }
        set.add(root.val);
        boolean right = inorderTraversal(root.right, k);
        
        return left || right;
    }
}