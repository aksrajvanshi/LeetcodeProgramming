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
    public boolean isValidBST(TreeNode root) {
        return isBST(Long.MIN_VALUE, root, Long.MAX_VALUE);
    }
    
    public boolean isBST(Long min, TreeNode root, Long max){
        
        if(root == null){
            return true;
        }
        
        if(root.val > min && root.val < max){
            return isBST(min ,root.left, (long) root.val) && isBST((long) root.val, root.right, max);
        }
        
        return false;
    }
}