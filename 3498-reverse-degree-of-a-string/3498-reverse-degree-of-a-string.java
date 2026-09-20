class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
             char ch=s.charAt(i);
             int reverse=(i+1)*(26-(ch-'a'));
             ans+=reverse;
        }
        return ans;
    }
}