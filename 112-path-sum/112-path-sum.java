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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return pathSum(root,targetSum,0);
    }
    public boolean pathSum(TreeNode root,int targetSum,int ssr){
        if(root==null){
            return false;
        }
        if(root.left==null && root.right==null && ssr+root.val==targetSum) 
            return true;
        
        return (pathSum(root.left,targetSum,ssr+root.val) || pathSum(root.right,targetSum,ssr+root.val));
        
    }
}