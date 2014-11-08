public class MergeSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode l ;
        if(l1.val <= l2.val){
            l = l1;
            l1 = l1.next;
        }else{
            l = l2;
            l2 = l2.next;
        }
        if(l1 == null) {
            l.next = l2;
            return l;
        }
        if(l2 == null) {
            l.next = l1;
            return l;
        }
        ListNode temp = l;
        while(l1 != null || l2 != null){
            while(l2 == null || l1.val <= l2.val ){
                temp.next = l1;
                l1 = l1.next;
                temp = temp.next;
                if(l1 == null) break;
            }
            while(l1 == null || l1.val > l2.val){
                if(l2 == null) break;
                temp.next = l2;
                l2 = l2.next;
                temp = temp.next;
                if(l2 == null) break;
            }
        }
        return l;
    }
}