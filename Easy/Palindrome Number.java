class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int y=x,s=0,r;
        while(x>0){
            r=x%10;
            x/=10;
            s=(s*10)+r;
        }
        if(s==y){
            return true;
        }
        else{
            return false;
        }
    }
}