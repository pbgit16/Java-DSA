class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int max_w=0;
        for(int[]customer:accounts){
            int w=0;
            for(int money:customer){
                w+=money;
            }
            max_w=Math.max(max_w,w);
        }
        return max_w;
    }
}