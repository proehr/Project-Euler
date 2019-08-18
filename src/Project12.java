import java.math.BigInteger;

public class Project12 {

    public long solution(){
        long i = 1;
        int add = 2;
        while(!test(i)){
            i+=add;
            add++;
        }
        return i;
    }

    private boolean test(long n) {
        int count=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                count+=2;
            }
        }
        if(Math.sqrt(n)*Math.sqrt(n)==n){
            count--;
        }
        if(count>=500){
            return true;
        }
        return false;
    }
}
