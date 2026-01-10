 class ListNode {
     int val;
     ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }


public class Remove_Duplicates_From_List {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                // skip the duplicate node
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }
}
