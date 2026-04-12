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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        if(root==null) return new ArrayList<>();
        preorder(root,output);
        return output;
    }
    public void preorder(TreeNode node,List<Integer> output){
        if(node==null) return;
        output.add(node.val);
        preorder(node.left,output);
        preorder(node.right,output);
    }
}