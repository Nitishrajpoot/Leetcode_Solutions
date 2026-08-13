class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> List=new ArrayList<>();
        Arrays.sort(nums);
        
        for(int k=0;k<nums.length-2;k++){
            if(nums[k]>0) break;
            if(k > 0 && nums[k]==nums[k-1]) continue;
            int i=k+1;
            int j=nums.length-1;
            while(i<j){
            if(nums[k]+nums[i]>0) break;
            
            int sum=nums[i]+nums[j]+nums[k];
            if(sum==0){
                List.add(Arrays.asList(nums[k],nums[i],nums[j]));
                i++;
                j--;
                while(nums[i]==nums[i-1] && i < j) i++;
                while(nums[j]==nums[j+1] && i < j) j--;

            }
            else if(sum>0){
                j--;
            }else{
                i++;
            }
            }
        }
       return List;
    }
}