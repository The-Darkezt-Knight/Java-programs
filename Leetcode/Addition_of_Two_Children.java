 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }

public class Addition_of_Two_Children {
  
    public boolean checkTree(TreeNode root) {
        return ((root.left.val + root.right.val) == root.val)? true : false;
    }
} 

