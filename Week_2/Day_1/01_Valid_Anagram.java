/*
LeetCode Problem: Valid Anagram (#242)
Language: Java
Week: 2
Day: 1

Approach:
First check whether both strings have the same length.
Use a frequency array of size 26.
Increment the count for characters in the first string and
decrement the count for characters in the second string.
If all frequencies become zero, the strings are anagrams.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
	public boolean isAnagram(String s, String t) {
		// If the strings have different lengths, they cannot be anagrams.
		if (s.length() != t.length()) {
			return false;
		}

		int[] count = new int[26];
		int n = s.length();

		// Track character balance for both strings in a single pass.
		for (int i = 0; i < n; i++) {
			count[s.charAt(i) - 'a']++;
			count[t.charAt(i) - 'a']--;
		}

		// Every frequency must be zero for the strings to be anagrams.
		for (int value : count) {
			if (value != 0) {
				return false;
			}
		}

		return true;
	}
}
