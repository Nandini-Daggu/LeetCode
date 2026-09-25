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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> lst = new ArrayList<>();
        helper(root,lst);
        return lst.get(k-1);
    }
    public void helper(TreeNode root,List<Integer> lst){
        if(root == null) return ;
        helper(root.left,lst);
        lst.add(root.val);
        helper(root.right,lst);
    }
}