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
    public void flatten(TreeNode root) {
        List<TreeNode> pre = new ArrayList<>();
        preorder(pre,root);
        for(int i=1;i<pre.size();i++){
            root.left = null;
            root.right = pre.get(i);
            root=root.right;
        }
    }
    public void preorder(List<TreeNode> pre,TreeNode node){
        if(node==null) return;
        pre.add(node);
        preorder(pre,node.left);
        preorder(pre,node.right);
    }
}