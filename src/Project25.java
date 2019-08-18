import java.math.BigInteger;

public class Project25 {

    public int solution(){
        BigInteger fib = new BigInteger("1");
        BigInteger save = new BigInteger("1");
        int count = 2;
        while(true){
            BigInteger foo = fib;
            fib = fib.add(save);
            save=foo;
            count++;
            if(fib.toString().length()>=1000){
                return count;
            }
        }
    }
}
