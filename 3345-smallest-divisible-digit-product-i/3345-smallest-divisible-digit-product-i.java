class Solution {
    public int smallestNumber(int n, int t) {
        
       while(n<=100){

        if(n<10){
            int num=n;
            int digit=num%10;
            if(digit%t==0){
                return n;
            }
        }
       else{
        int num=n;
        int digit=num%10;
        num=num/10;
        digit*=num%10;
        if(digit%t==0 ){
            return n;
        }}

        n++;
       }
       if(t>=n) return t;
       return -1;
    }
}