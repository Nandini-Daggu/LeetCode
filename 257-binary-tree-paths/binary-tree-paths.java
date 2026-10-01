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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> lst = new ArrayList<>();
        helper(root,"",lst);
        return lst;
    }
    public void helper(TreeNode root,String s,List<String> lst){
        if(root==null)
            return;
        if(root.left==null&&root.right==null)
            lst.add(s+root.val);
        if(root.left!=null)
            helper(root.left,s+root.val+"->",lst);
        if(root.right!=null)
            helper(root.right,s+root.val+"->",lst);
    }
}