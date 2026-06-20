/*
LeetCode Problem: Merge Two Sorted Lists (#21)
Language: Java
Week: 3
Day: 2

Approach:
Use a dummy node to simplify list construction.
Maintain a tail pointer for the merged list.
Compare nodes from both lists and attach the smaller node to the result.
After one list is exhausted, attach the remaining nodes of the other list.

Time Complexity: O(n + m)
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

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode dummy = new ListNode(-1);
		ListNode tail = dummy;

		while (list1 != null && list2 != null) {
			// Attach the smaller node to the merged list.
			if (list1.val <= list2.val) {
				tail.next = list1;
				list1 = list1.next;
			} else {
				tail.next = list2;
				list2 = list2.next;
			}

			// Advance the tail pointer after appending a node.
			tail = tail.next;
		}

		// Attach whichever list still has remaining nodes.
		if (list1 != null) {
			tail.next = list1;
		} else {
			tail.next = list2;
		}

		return dummy.next;
	}
}
