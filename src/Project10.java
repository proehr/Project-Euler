public class Project10 {
    public long solution(){
        long ret = 0;
        for(int i=2;i<2000000;i++){
            if(isPrime(i)){
                ret+=i;
            }
        }
        return ret;
    }

    private boolean isPrime(int n) {
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
}
