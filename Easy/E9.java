public class E9 {
    public static boolean main() {
        int x=121;
        if(x<0){
            return false;
        }
        int y=x,s=0;
        byte r=0;
        while(x>0){
            r+=x%10;
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