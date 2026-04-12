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
    public static void right(int layer,TreeNode root,ArrayList<Integer> list){
        if(root==null) return ;
        if(layer == list.size()) list.add(root.val);
        right(layer+1,root.right,list);
        right(layer+1,root.left,list);
    }
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> output = new ArrayList<>();
        right(0,root,output);
        return output;
    }
}