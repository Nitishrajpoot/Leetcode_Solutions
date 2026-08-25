class Solution {
    public int missingMultiple(int[] nums, int k) {
        int j=1;
        while(true){
           int mul=k*j;
           boolean num=false;
           for(int i=0;i<nums.length;i++){
            if(mul==nums[i]){
                 num=true;
                 break;
            }
           }
             if(num==false){
                return mul;
             }
             j++;
        }
        
    }
}