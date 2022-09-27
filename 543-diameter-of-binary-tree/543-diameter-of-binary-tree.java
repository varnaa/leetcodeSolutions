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
    private int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        heightOfBinaryTree(root);
        return max;

    }
    
    private int heightOfBinaryTree(TreeNode root){
        if(root == null){
            return 0;
        }
        
        int leftHeight = heightOfBinaryTree(root.left);
        int rightHeight = heightOfBinaryTree(root.right);
        
        max = Math.max(max, (leftHeight + rightHeight));
        return  Math.max(leftHeight, rightHeight) + 1;
    }
}