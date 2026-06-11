/*
LeetCode Problem: Find the Index of the First Occurrence in a String (#28)
Language: Java
Week: 2
Day: 3

Approach:
Use brute-force pattern matching.
Try every possible starting position in the haystack.
For each position, compare characters of the needle one by one.
If all characters match, return the starting index.
If no match is found, return -1.

Time Complexity: O((m - n + 1) × n)
Space Complexity: O(1)
*/

class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        int m = haystack.length();

        // Try every possible starting position in the haystack
        for (int i = 0; i <= m - n; i++) {
            // Compare characters of needle with haystack starting at position i
            int j = 0;
            while (j < n && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            // If all characters matched, return the starting index
            if (j == n) {
                return i;
            }
        }

        // No occurrence found
        return -1;
    }
}
