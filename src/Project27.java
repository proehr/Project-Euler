import java.util.ArrayList;
import java.util.List;

public class Project27 {
    public int solution(){
        int max=0;
        int ret=0;
        List<Integer> primes=new ArrayList<Integer>();
        for(int i=1;i<=999;i++){
            if(isPrime(i)){
                primes.add(i);
            }
        }

        for(int a=-999;a<=999;a++){
            for(int b : primes){
                int n = 0;
                while(isPrime(n*n +n*a +b)){
                    n++;
                }
                if(n>max){
                    System.out.println(a+ " "+b + " " + n);
                    max = n;
                    ret=a*b;
                }
            }
        }
        return ret;
    }

    private boolean isPrime(long n){
        if(n<=0){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
