/* Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false */





var isAnagram = function(s, t) {
    const sort = s => s.toLowerCase().split('').sort().join('');
    return sort(s) === sort(t)
};