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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        if(root==null) return new ArrayList<>();
        inorder(root,output);
        return output;
    }
    public void inorder(TreeNode node,List<Integer> output){
        if(node!=null){
            inorder(node.left,output);
            output.add(node.val);
            inorder(node.right,output);
        }
    }
}