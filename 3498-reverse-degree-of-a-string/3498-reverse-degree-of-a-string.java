class Solution {
    public int reverseDegree(String s) {
        char nums[]=new char[27];
        char letter='z';
        for(int i=1;i<nums.length;i++){
            nums[i]=letter;
            letter--;
        }
        int ans=0;
        for(int i=0;i<s.length();i++){

            for(int j=1;j<nums.length;j++){
                if(s.charAt(i)==nums[j]){
                    ans+=j*(i+1);
                }
            }

           
        }
    return ans;


    }
}