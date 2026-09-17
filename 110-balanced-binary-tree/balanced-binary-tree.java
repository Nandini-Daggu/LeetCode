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
    public boolean isBalanced(TreeNode root) {
        if(height(root)!=-1)
            return true;
        return false;
    }
    public int height(TreeNode root){
        if(root == null)
            return 0;
        int hleft = height(root.left);
        if(hleft==-1)
            return -1;
        int hright = height(root.right);
        if(hright==-1)
            return -1;
        if(Math.abs(hleft-hright)>1)
            return -1;
        return 1+Math.max(hleft,hright);
    }
}