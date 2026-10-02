class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode t1 = list1;
        ListNode t2 = list2;
        ListNode t3;
        if(t1.val >= t2.val){ 
            t3 = new ListNode(t2.val);
            t2 = t2.next;
        }
        else{ 
            t3 = new ListNode(t1.val);
            t1 = t1.next;
        }
        ListNode head = t3;
        while(t1!=null && t2!=null){
            if(t1.val>=t2.val){ 
                t3.next = new ListNode(t2.val);
                t2 = t2.next;
            }
            else{  
                t3.next = new ListNode(t1.val);
                t1 = t1.next;
            }
            t3 = t3.next;
        }
        t3.next = (t1 != null) ? t1 : t2;
        return head;
    }
}