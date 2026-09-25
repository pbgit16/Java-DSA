class Solution {
    public int search(int[] nums, int target) {
       
    return helper(nums,target,0,nums.length-1) ;
       
    }
    private  int helper(int[] arr, int target, int start, int end) {

    // Base condition
    if (start > end) {
        return -1;
    }

    int mid = start + (end - start) / 2;

    // Target found
    if (arr[mid] == target) {
        return mid;
    }

    // Target is in left half
    if (target < arr[mid]) {
        return helper(arr, target, start, mid - 1);
    }

    // Target is in right half
    return helper(arr, target, mid + 1, end);
}
}