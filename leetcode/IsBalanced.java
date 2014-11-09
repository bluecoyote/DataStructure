public class IsBalanced {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int ll = getHeight(root.left);
        int rr = getHeight(root.right);
        return (Math.abs(ll - rr) <= 1) && isBalanced(root.left) && isBalanced(root.right);
    }
    private int getHeight(TreeNode root){
        if(root == null) return 0;
        int lh = getHeight(root.left);
        int rh = getHeight(root.right);
        int max = lh > rh ? lh : rh;
        return 1 + max;
    }
}