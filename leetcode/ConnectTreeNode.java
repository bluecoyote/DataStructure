/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class ConnectTreeNode {
    public void connect(TreeLinkNode root) {
        Queue<TreeLinkNode> qr = new LinkedList();
        Queue<TreeLinkNode> q = new LinkedList(); 
        TreeLinkNode temp = root;
        while( temp != null){
            qr.add(temp);
            temp.next = null;
            temp = temp.right;
        }
        if(root != null){
            q.add(root);
             while(!q.isEmpty()){
                TreeLinkNode tmp = q.poll();
                if(tmp.left != null) q.add(tmp.left);
                if(tmp.right != null) q.add(tmp.right);
                if(tmp != qr.peek()){
                    tmp.next = q.peek();
                }else{
                    qr.poll();
                }
            }
        }
        
    }
}