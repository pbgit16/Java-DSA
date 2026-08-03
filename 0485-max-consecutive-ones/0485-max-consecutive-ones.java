class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int current_count=0;
     int max_count=0;
     int n=nums.length;
     int j=0;

     while(j<n){
        if(nums[j]==1){
            current_count++;
        }
        else{
            max_count=Math.max(max_count, current_count);
            current_count=0;
        }
        j++;
     }
        return Math.max(max_count,current_count);
    }
}