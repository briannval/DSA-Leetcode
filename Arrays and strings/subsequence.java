// Given two strings s and t
// Return true if s is a subsequence of t,
// or false otherwise

// LEETCODE PROBLEM 392

class Solution{
    public boolean subsequence(String s, String t){
        int i = 0;
        int j = 0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        boolean result = (s.length()==i);
        return result;
    }
}

// TWO POINTERS CLASSIC PROBLEM