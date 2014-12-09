/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class InOrder {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> s = new Stack<TreeNode>();
        List<Integer> t = new ArrayList<Integer>();
        while(root != null || !s.empty()){
            while(root != null){
                s.push(root);
                root = root.left;
            }
            if(!s.empty()){
                root = s.pop();
                t.add(root.val);
                root = root.right;
            }
        }

        return t;
    }
}