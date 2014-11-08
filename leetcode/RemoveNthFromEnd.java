public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tt = head;
        int length = 0;
        while(tt != null) {
            tt = tt.next;
            length++;
        }
        if(n == length) {
            head = head.next;
            return head;
        }
        int i = 1;
        tt = head;
        while(i < length - n){
            tt = tt.next;
            i++;
        }
        if(tt.next != null){
            tt.next = tt.next.next;
        }else{
            tt.next = null;
        }
        
        return head;    
    }
}