class Solution {
    public int maxArea(int[] height) {
        int i=0, j=height.length-1;
        int maxWat=0;
        while(i<j){
           int minHeight=Math.min(height[i],height[j]);
           int Area=(j-i)*minHeight;
           maxWat=Math.max(maxWat,Area);
           if(height[i]<height[j]){
            i++;
           }else{
            j--;
           }
        }
        return maxWat;
    }
}