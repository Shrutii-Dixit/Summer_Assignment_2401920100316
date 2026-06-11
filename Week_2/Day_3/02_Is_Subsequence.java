/*
LeetCode Problem: Is Subsequence (#392)
Language: Java
Week: 2
Day: 3

Approach:
Use two pointers.
Traverse string t and try to match characters of string s in order.
Whenever matching characters are found, move the pointer of s forward.
If all characters of s are matched, then s is a subsequence of t.

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public boolean isSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();

        // Pointer for string s
        int j = 0;

        // Traverse string t and match characters of s in order
        for (int i = 0; i < n && j < m; i++) {
            // If characters match, move pointer j forward
            if (t.charAt(i) == s.charAt(j)) {
                j++;
            }
        }

        // If all characters of s are matched, s is a subsequence of t
        return j == m;
    }
}
