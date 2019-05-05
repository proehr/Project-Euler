public class Project7 {
    public long solution(){
        int i=1;
        long foo=1;
        while(i<=10001){
            foo++;
            if(isPrime(foo)){
                i++;
            }
        }
        return foo;
    }

    private boolean isPrime(long n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
