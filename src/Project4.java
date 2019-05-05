public class Project4 {
    private boolean isPalindrome(int n){
        String nstring = Integer.toString(n);
        for(int i=0; i<=nstring.length()/2;i++){
            if(nstring.charAt(i)!=nstring.charAt(nstring.length()-1-i)){
                return false;
            }
        }
        return true;
    }



    public int solution(){
        int ret=0;
        for(int i=100;i<=999;i++){
            for (int j=i;j<=999;j++){
                if(isPalindrome(i*j) && i*j>ret){
                    ret=i*j;
                    System.out.println(ret);
                }
            }
        }
        return ret;
    }
}
