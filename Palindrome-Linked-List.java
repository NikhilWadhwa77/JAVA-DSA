/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {

    ListNode temp = head;
		
		int len = 0;
		
		while(temp != null) {
			temp = temp.next;
			len++;
		}
		
		int till = len/2;
		
		if(len % 2 != 0) {
			till++;
		}
		
		temp = head;
		
		for(int i = 0; i < till; i++) {
			temp = temp.next;
		}
		
		Stack<Integer> st = new Stack<>();
		
		ListNode start = head;
		
		for(int i = 0; i < (len/2); i++) {
			st.push(start.val);
			start = start.next;
		}
		
		while(temp != null) {
			if(st.pop() != temp.val) {
				return false;
			}
			temp = temp.next;
		}
		
		return true;
    }
}
