/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class PreOrder {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> lst = new ArrayList<Integer>();
        if(root != null){
            stack.push(root);
            while(!stack.empty()){
                TreeNode tmp = stack.pop();
                lst.add(tmp.val);
                if(tmp.right != null) stack.push(tmp.right);
                if(tmp.left != null) stack.push(tmp.left);
            }
        }
        return lst;
    }
}