public class Project36 {

    private boolean isPalindrome(String n){
        for(int i=0; i<=n.length()/2;i++){
            if(n.charAt(i)!=n.charAt(n.length()-1-i)){
                return false;
            }
        }
        return true;
    }


    public int solution(){
        int sum =0;
        for(int i=1;i<1000000;i+=2){
            if(isPalindrome(Integer.toString(i)) && isPalindrome(Integer.toBinaryString(i))){
                sum += i;
                System.out.println(i);
            }
        }
        return sum;
    }
}
