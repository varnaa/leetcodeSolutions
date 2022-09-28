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
    public TreeNode sortedArrayToBST(int[] nums) {
        return constructTree(nums, 0, nums.length-1);
    }
    
    private TreeNode constructTree(int[] nums, int left, int right){
        if(left > right || nums.length == 0){
            return null;
        }
        
        int mid = left + (right - left) / 2;
        TreeNode current = new TreeNode(nums[mid]);
        
        current.left = constructTree(nums, left, mid-1);
        current.right = constructTree(nums, mid+1, right);
        
        return current;
    }
}