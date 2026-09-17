class Solution {
    public int maxSubArray(int[] nums) {
        int Maxsum=nums[0];
int curr_sum=0;

for(int num:nums){
    curr_sum+=num;
    Maxsum=Math.max(Maxsum, curr_sum);

    if(curr_sum < 0){
        curr_sum=0;
    }
}
return Maxsum;
    }
}