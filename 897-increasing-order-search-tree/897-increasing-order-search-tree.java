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
    TreeNode result = new TreeNode(-1);
    public TreeNode increasingBST(TreeNode root) {
        TreeNode temp = result;
       inorderTraversal(root);
        return temp.right;
    }
    
    private void inorderTraversal(TreeNode root){
         if(root == null){
            return;
        }
        
        inorderTraversal(root.left);
        
        result.right = new TreeNode(root.val);
        result = result.right;
        
        inorderTraversal(root.right);
    }
}