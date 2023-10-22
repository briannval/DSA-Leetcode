// Given a string s, return true if it is a palindrome
// false if it is otherwise

class Solution{
    public boolean checkIfPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

// TIP: Understand two pointer algorithm!