class Solution {
    public int maxSubarraySumCircular(int[] nums) {
         int currentmax=0;
        int max_sum=Integer.MIN_VALUE;
        int currmin=0;
        int min_sum=Integer.MAX_VALUE;

        int totalsum=0;

        for(int num:nums){
            currentmax=Math.max(num,currentmax+num);
            max_sum=Math.max(currentmax , max_sum);

            currmin=Math.min(num,currmin+num);
            min_sum=Math.min(currmin,min_sum);

            totalsum+=num;
        }
        if(max_sum < 0) 
        {
            return max_sum;
        }
        return Math.max(max_sum,totalsum-min_sum);
    }
}