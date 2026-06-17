/*
LeetCode Problem: Middle of the Linked List (#876)
Language: Java
Week: 3
Day: 1

Approach:
Use the Fast and Slow Pointer technique.
Both pointers start at the head of the linked list.
The slow pointer moves one step at a time, while the fast pointer moves two steps.
When the fast pointer reaches the end of the list, the slow pointer will be at the middle node.

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
 *     ListNode(int val, ListNode next) { this.val = next; }
 * }
 */
class Solution {

	public ListNode middleNode(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			// Move the slow pointer one step forward.
			slow = slow.next;

			// Move the fast pointer two steps forward.
			fast = fast.next.next;
		}

		// When fast reaches the end, slow points to the middle node.
		return slow;
	}
}
