class Solution {
    public int jump(int[] nums) {
        int maxReach=0;
        int jumps=0;
        int end=0;
        for(int i=0;i<nums.length-1;i++){
            maxReach=Math.max(maxReach,i+nums[i]);

            if(end==i){
                jumps++;
                end=maxReach;
            }
        }
        return jumps;
    }
}