
public class ListNode {
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

class Solution {
    // ListNode returnLastNode(ListNode head) {
    // if(head == null) return null;
    // ListNode fast = head;
    // while(fast.next != null) {
    // fast = fast.next;
    // }
    // return fast;
    // }

    ListNode returnLast(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    ListNode reverseList(ListNode slow) {
        ListNode prev = null;
        ListNode curr = slow;
        ListNode nxt = null;
        while (curr != null) {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev ;
    }

    public boolean isPalindrome(ListNode head) {
        if (head.next == null) {
            return false;
        }

        ListNode slow = returnLast(head);
        ListNode start = head;
        ListNode end = reverseList(slow);
        while (end != null && end.next != null) {
            if (start.val != end.val) {
                return false;
            }
            start = start.next;
            end = end.next;
        }
        return true;
    }
}