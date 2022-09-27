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
public class TreeData{
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    int sum = 0;
    
    public TreeData(){}
    public TreeData(int min, int max, int sum){
        this.min = min;
        this.max = max;
        this.sum = sum ;
    }
}
class Solution {
    private int result = 0;
    public int maxSumBST(TreeNode root) {
        findMaxBST(root);
        return result;
    }
    
    private TreeData findMaxBST(TreeNode root){
        if(root == null){
            return new TreeData();
        }
        
        TreeData leftSubtree = findMaxBST(root.left);
        TreeData rightSubtree = findMaxBST(root.right);
        
        if(leftSubtree.max >= root.val || rightSubtree.min <= root.val){
            return new TreeData(Integer.MIN_VALUE, Integer.MAX_VALUE,
                               0);
        }
        
        int sum = root.val + leftSubtree.sum + rightSubtree.sum;
        result = Math.max(sum, result);
        
        return new TreeData(
            Math.min(root.val, leftSubtree.min),
            Math.max(root.val, rightSubtree.max),
            sum
        );
    }
}