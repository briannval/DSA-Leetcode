// Given two sorted integer arrays arr1 and arr2,
// return a new array that combines both of them and is also sorted
import java.util.List;
import java.util.ArrayList;

class Solution{
    public List<Integer> combine(int[] arr1, int[] arr2) {
    // ans is the answer
    List<Integer> ans = new ArrayList<>();
    int i = 0;
    int j = 0;

    while (i < arr1.length && j < arr2.length) {
        if (arr1[i] < arr2[j]) {
            ans.add(arr1[i]);
            i++;
        } else {
            ans.add(arr2[j]);
            j++;
        }
    }

    while (i < arr1.length) {
        ans.add(arr1[i]);
        i++;
    }

    while (j < arr2.length) {
        ans.add(arr2[j]);
        j++;
    }

    return ans;
}
}