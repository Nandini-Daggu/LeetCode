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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lst = new ArrayList<>();
        pre(root,0,lst);
        return lst;
    }
    public static void pre(TreeNode root,int n,List<List<Integer>>lst){
        if(root == null) return;
        if(lst.size()==n){
            List<Integer> l1 = new ArrayList<>();
            l1.add(root.val);
            lst.add(l1);
        }
        else
            lst.get(n).add(root.val);
        pre(root.left,n+1,lst);
        pre(root.right,n+1,lst);
    }
}