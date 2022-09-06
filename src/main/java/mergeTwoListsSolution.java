import com.sun.org.apache.bcel.internal.generic.RETURN;

public  class mergeTwoListsSolution {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null){
            return null;
        }
        ListNode head = new ListNode();
        ListNode p = head;
        while (list1 != null || list2 != null) {
            ListNode tmp1 = list1;
            ListNode tmp2 = list2;
            if(tmp1 == null){
                p.val = list2.val;
                list2 = list2.next;
            }
            if(tmp2 == null){
                p.val = list1.val;
                list1 = list1.next;
            }
            if(tmp1 != null && tmp2 != null){
                if(list1.val  > list2.val){
                    p.val = list2.val;
                    list2 = list2.next;
                }else{
                    p.val = list1.val;
                    list1 = list1.next;
                }
            }
            if(list1 != null || list2 != null){
                p.next = new ListNode();
                p = p.next;
            }
        }
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        ListNode list1 =  new ListNode(0);
        mergeTwoLists(null,list1);
    }
}
