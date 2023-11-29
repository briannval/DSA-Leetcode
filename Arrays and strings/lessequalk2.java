// Given an array of positive integers nums and integers k,
// find the length of the longest subarrray whose less than or equal to k.

class Solution {
    public int findLength(int[] nums, int k){
        int left = 0;
        int curr = 0;
        int ans = 0;
        for (int right = 0 ; i < nums.length ; i++){
            curr += nums[right];
            while (curr > k) {
                curr -= nums[left];
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}

// SLIDING WINDOW PROBLEM
