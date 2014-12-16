/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] num) {
        
        if(num == null || num.length == 0) return null;
        return toTree(num,0,num.length-1);
    }
    
    private TreeNode toTree(int[] num, int left, int right){
        int mid = (left + right +1) >> 1;
        TreeNode root = new TreeNode(num[mid]);
        TreeNode tmp = root;
        if(left < right){
            if(mid - 1 >= left) tmp.left = toTree(num, left, mid-1);
            if(mid + 1 <= right) tmp.right = toTree(num,mid+1,right);
        }
        return root;
    }
    
}