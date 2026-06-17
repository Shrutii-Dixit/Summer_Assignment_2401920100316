/*
LeetCode Problem: Reverse Linked List (#206)
Language: Java
Week: 3
Day: 1

Approach:
Use three pointers:
- prev: points to the previous node
- curr: points to the current node
- next: stores the next node temporarily

Reverse the link of each node one by one while traversing the list.
At the end, prev becomes the new head of the reversed linked list.

Time Complexity: O(n)
Space Complexity: O(1)
*/

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

	public ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;

		while (curr != null) {
			// Store the next node before reversing the link.
			ListNode next = curr.next;

			// Reverse the current node's pointer.
			curr.next = prev;

			// Move prev and curr one step forward.
			prev = curr;
			curr = next;
		}

		// prev becomes the new head after the list is fully reversed.
		return prev;
	}
}
