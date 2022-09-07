import java.util.HashMap;
import java.util.Map;

public class GetIntersectionNodeSolution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<Integer,ListNode> map = new HashMap();
        while (headA != null){
            map.put(headA.hashCode(),headA);
            headA = headA.next;
        }
        while (headB != null){
            if(map.containsKey(headB.hashCode())){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;

    }
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
