package Week_3.Day_2;

/*
LeetCode Problem: Remove Nth Node From End of List (#19)
Language: Java
Week: 3
Day: 2

Approach:
Use two pointers: fast and slow.
First move the fast pointer n steps ahead.
If fast becomes null, it means the head node must be removed.
Otherwise, move both pointers together until fast reaches the last node.
The slow pointer will then be positioned just before the node to be deleted.

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

// Keep the LeetCode-compatible class name `Solution` as required.
public class Solution {

	/**
	 * Removes the nth node from the end of the list and returns the head.
	 * Uses a two-pointer technique to do this in one pass.
	 */
	public ListNode removeNthFromEnd(ListNode head, int n) {
		// Initialize both pointers to the head of the list.
		ListNode fast = head;
		ListNode slow = head;

		// Move `fast` n steps ahead.
		for (int i = 0; i < n; i++) {
			fast = fast.next;
		}

		// If `fast` is null after advancing, the node to remove is the head.
		if (fast == null) {
			return head.next;
		}

		// Move both pointers until `fast` reaches the last node.
		// After the loop, `slow` will be just before the node to remove.
		while (fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}

		// Remove the target node by skipping it in the list.
		slow.next = slow.next.next;

		return head;
	}
}
