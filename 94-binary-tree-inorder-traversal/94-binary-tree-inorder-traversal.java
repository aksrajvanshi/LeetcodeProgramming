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
    
    Stack<TreeNode> inorder = new Stack<>();
    List<Integer> result = new ArrayList<>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        
        if(root == null){
            return result;
        }
        
        inorder.push(root);
        
        while(!inorder.isEmpty()){
            
            while(root.left != null){
                inorder.push(root.left);
                root = root.left;
            }    
            
            TreeNode cur = inorder.pop();
            result.add(cur.val);
            
            if(cur.right!= null){
                inorder.push(cur.right);
                root = cur.right;
            }
        }
        
        return result;
    }
}