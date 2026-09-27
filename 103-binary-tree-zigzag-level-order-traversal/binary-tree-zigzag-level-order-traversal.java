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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> lst = new ArrayList<>();
        if(root == null)
            return lst;
        helper(root,lst,0);
        return lst;
    }
    public void helper(TreeNode root,List<List<Integer>> lst,int lvl){
        if(root == null)
            return;
        if(lst.size()<=lvl){
            List<Integer> in = new LinkedList<>();
            lst.add(in);
        }
        List<Integer> out = lst.get(lvl);
        if(lvl%2==0) out.add(root.val);
        else out.add(0,root.val);
        helper(root.left,lst,lvl+1);
        helper(root.right,lst,lvl+1);
    }
}