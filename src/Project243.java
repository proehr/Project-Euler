import java.util.ArrayList;
import java.util.List;

public class Project243 {

    public long solution(){
        long foo=23;
        List<Long> primes = new ArrayList<>();
        while(foo<=50){
            foo++;
            if(isPrime(foo)){
                primes.add(foo);
            }
        }
        long n=892371480;
        double compare = 15499/94744.0;
        System.out.println("done");
        while(true){
            long count=0;
            for(long i=1;i<n;i++){
                if(biggestCommonDivisor(i,n)==1){
                    count++;
                }
            }
            System.out.println(count +"/" + n);
            if(count/(double)(n-1)<=compare){
                return n;
            }
            n+=223092870;
        }
    }

    private long biggestCommonDivisor(long a, long b){
        while (b != 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
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
