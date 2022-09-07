import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * @Description 链表性能 > map > list
 * @Date 15:53 2022/9/7
 **/
public class HasCycleSolution {
    public boolean hasCycle(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        while (head != null) {
            if (list.contains(head)) {
                return true;
            }
            list.add(head);
            head = head.next;
        }
        return false;
    }

    public boolean hasCycle1(ListNode head) {
        Map<Integer, ListNode> map = new HashMap<>();
        while (head != null) {
            int i = head.hashCode();
            if (map.containsKey(i)) {
                return true;
            }
            map.put(i, head);
            head = head.next;
        }
        return false;
    }

    public boolean hasCycle2(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            int i = head.hashCode();
            if (list.contains(i)) {
                return true;
            }
            list.add(i);
            head = head.next;
        }
        return false;
    }

    public boolean hasCycle3(ListNode head) {
        ListNode car = head;
        ListNode bike = head;

        // 循环内 bike 每次后移一个结点， car 每次后移 2 个结点
        // car 和 car.next 需要不为空，否则会发生 空指针异常
        // car 不为空，那么 bike 肯定也不为空
        while(car != null && car.next != null) {
            bike = bike.next;
            car = car.next.next;

            // 汽车追上自行车了，有环路
            if(car == bike) return true;
        }
        return false;
    }


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}
