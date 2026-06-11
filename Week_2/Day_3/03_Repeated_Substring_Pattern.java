/*
LeetCode Problem: Repeated Substring Pattern (#459)
Language: Java
Week: 2
Day: 3

Approach:
Use the string concatenation trick.
Create a new string by concatenating the original string with itself.
Remove the first and last characters from the concatenated string.
If the original string exists inside the modified string,
then the original string is formed by repeating a substring.

Time Complexity: O(n)
Space Complexity: O(n)
*/

package Week_2.Day_3;

class Solution {
	public boolean repeatedSubstringPattern(String s) {
		// Concatenate the string with itself
		String doubled = s + s;

		// Remove the first and last characters before checking containment
		return doubled.substring(1, doubled.length() - 1).contains(s);
	}
}
