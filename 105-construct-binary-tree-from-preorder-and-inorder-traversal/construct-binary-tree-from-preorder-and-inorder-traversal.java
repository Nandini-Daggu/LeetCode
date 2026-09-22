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
    int ind = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0;i<inorder.length;i++){
            mp.put(inorder[i],i);
        }
        return helper(preorder,0,inorder.length-1,mp);
    }
    public TreeNode helper(int[] preorder,int start,int end,HashMap<Integer,Integer> mp){
        if(start>end) return null;
        int root = preorder[ind++];
        TreeNode node = new TreeNode(root);
        int in = mp.get(root);
        node.left = helper(preorder,start,in-1,mp);
        node.right = helper(preorder,in+1,end,mp);
        return node;
    }
}