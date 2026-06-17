/*
LeetCode Problem: Linked List Cycle (#141)
Language: Java
Week: 3
Day: 1

Approach:
Use Floyd's Cycle Detection Algorithm (Tortoise and Hare).
Maintain two pointers:
- Slow pointer moves one step at a time.
- Fast pointer moves two steps at a time.

If a cycle exists, both pointers will eventually meet.
If the fast pointer reaches null, no cycle exists.

Time Complexity: O(n)
Space Complexity: O(1)
*/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

	public boolean hasCycle(ListNode head) {
		if (head == null) {
			return false;
		}

		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			// Move the slow pointer one step.
			slow = slow.next;

			// Move the fast pointer two steps.
			fast = fast.next.next;

			// If both pointers meet, a cycle exists.
			if (slow == fast) {
				return true;
			}
		}

		// If the fast pointer reaches the end, there is no cycle.
		return false;
	}
}