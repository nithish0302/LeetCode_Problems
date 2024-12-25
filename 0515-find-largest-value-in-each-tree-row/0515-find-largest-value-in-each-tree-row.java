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
    public List<Integer> largestValues(TreeNode root) {
            List<Integer>li=new ArrayList<>();

        if(root==null)
        return li;
        Queue<TreeNode>queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
          int size=queue.size();
          int max=Integer.MIN_VALUE;
          for(int i=0;i<size;i++)
          {
            TreeNode pq=queue.poll();
            if(max<pq.val)
             max=pq.val;

            if(pq.left!=null)
            queue.add(pq.left);

            if(pq.right!=null)
            queue.add(pq.right);
          }
          li.add(max);

        }
        return li;
    }
}