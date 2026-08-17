class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0, ans=Integer.MAX_VALUE, sum=0;
       
        for(int right=0;right<nums.length;right++){
            
            sum+=nums[right];
           
            while(sum>=target){
                int len=right-left+1;
                ans=Math.min(ans,len);

                sum-=nums[left];
                left++;
            }
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}