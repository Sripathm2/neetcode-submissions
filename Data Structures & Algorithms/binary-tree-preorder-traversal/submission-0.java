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
        List<Integer> order = new ArrayList<Integer>();

        ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
        queue.add(0,root);
        while(!queue.isEmpty()){
            TreeNode temp = queue.remove(0);
            if(temp != null)
                order.add(temp.val);
            if(temp != null && temp.right != null)
                queue.add(0, temp.right);
            if(temp != null && temp.left != null)
                queue.add(0, temp.left);
        }
        return order;
    }
}