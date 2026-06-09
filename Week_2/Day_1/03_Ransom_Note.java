/*
LeetCode Problem: Ransom Note (#383)
Language: Java
Week: 2
Day: 1

Approach:
Use a frequency array of size 26.
Count the frequency of each character required in the ransom note.
Then subtract the frequency of characters available in the magazine.
If any frequency remains positive, the magazine does not contain enough
characters to construct the ransom note.

Time Complexity: O(n + m)
Space Complexity: O(1)
*/

class Solution {
	public boolean canConstruct(String ransomNote, String magazine) {
		// Frequency array for lowercase English letters
		int[] freq = new int[26];

		// Count required characters from the ransom note
		int n = ransomNote.length();
		for (int i = 0; i < n; i++) {
			freq[ransomNote.charAt(i) - 'a']++;
		}

		// Subtract available characters from the magazine
		int m = magazine.length();
		for (int i = 0; i < m; i++) {
			freq[magazine.charAt(i) - 'a']--;
		}

		// If any required count is still positive, magazine is insufficient
		for (int count : freq) {
			if (count > 0) {
				return false;
			}
		}

		return true;
	}
}

public class 03_Ransom_Note {
    
}
