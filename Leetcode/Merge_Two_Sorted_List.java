package Leetcode;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class Merge_Two_Sorted_List {
  public ListNode mergeUnique(ListNode list1, ListNode list2) {
    ListNode dummy = new ListNode(0);
    ListNode tail = dummy;
    ListNode a = list1, b = list2;
    Integer lastAdded = null;

    while (a != null && b != null) {
      int val;
      if (a.val < b.val) { val = a.val; a = a.next; }
      else if (a.val > b.val) { val = b.val; b = b.next; }
      else { val = a.val; a = a.next; b = b.next; }

      if (lastAdded == null || lastAdded != val) {
        tail.next = new ListNode(val);
        tail = tail.next;
        lastAdded = val;
      }
    }

    while (a != null) {
      int val = a.val; a = a.next;
      if (lastAdded == null || lastAdded != val) {
        tail.next = new ListNode(val);
        tail = tail.next;
        lastAdded = val;
      }
    }
    while (b != null) {
      int val = b.val; b = b.next;
      if (lastAdded == null || lastAdded != val) {
        tail.next = new ListNode(val);
        tail = tail.next;
        lastAdded = val;
      }
    }

    return dummy.next;
  }
}
