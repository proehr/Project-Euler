public class Project3 {
    public long solution(){
        return calc(600851475143l);
    }

    private long calc(long n){
        long maxi=1;
        for(long i = 2; i*i <=n;i++){
            while(n%i == 0){
                maxi=i;
                n/=i;
            }
        }
        if(n>1){
            return n;
        }
        return maxi;
    }
}
