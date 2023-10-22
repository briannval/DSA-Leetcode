// Given a SORTED ARRAY and TARGET NUMBER
// return true if there exists a pair of integers that sum up to target
// and false otherwise

class Solution{
    public boolean checkTarget(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int temp = nums[left] + nums[right];
            if(temp==target){
                return true;
            }
            if(temp<target){
                left--;
            }
            else{
                right--;
            }
        }
        return false;
    }
}

// Compare this to TWO SUM with UNSORTED ARRAY -> use hashmap
// Also two pointers problem
// Number too small -> move left
// Number too large -> move right