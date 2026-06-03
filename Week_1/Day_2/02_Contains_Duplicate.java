/*
LeetCode Problem: Contains Duplicate (#217)
Language: Java
Week: 1
Day: 2

Approach:
Use a HashSet to keep track of elements that have already been seen.
While traversing the array, if an element already exists in the HashSet,
a duplicate has been found and true is returned immediately.
Otherwise, add the element to the HashSet and continue.

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
	public boolean containsDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet<>();

		for (int num : nums) {
			// If the number is already present, a duplicate exists.
			if (set.contains(num)) {
				return true;
			}

			// Record the number so future matches can be detected.
			set.add(num);
		}

		return false;
	}
}
