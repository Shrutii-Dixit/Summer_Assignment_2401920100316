package Week_3.Day_2;

/*
LeetCode Problem: Palindrome Linked List (#234)
Language: Java
Week: 3
Day: 2

Approach:
1. Use fast and slow pointers to find the middle of the linked list.
2. Reverse the second half of the list.
3. Compare nodes from the first half and the reversed second half.
4. If all corresponding values match, the linked list is a palindrome.

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
	public boolean isPalindrome(ListNode head) {
		// Find the middle of the list using the fast and slow pointer technique.
		ListNode fast = head;
		ListNode slow = head;

		// These pointers are used to reverse the second half of the list.
		ListNode curr = head;
		ListNode prev = null;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		// If the list has even length, start from `slow`.
		// If it has odd length, skip the middle node and start from `slow.next`.
		if (fast == null) {
			curr = slow;
		} else {
			curr = slow.next;
		}

		// Reverse the second half of the linked list in place.
		while (curr != null) {
			ListNode next = curr.next;

			curr.next = prev;
			prev = curr;
			curr = next;
		}

		// Compare the first half with the reversed second half.
		curr = head;

		while (prev != null) {
			if (prev.val != curr.val) {
				return false;
			}

			prev = prev.next;
			curr = curr.next;
		}

		return true;
	}
}
