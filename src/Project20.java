import java.math.BigInteger;

public class Project20 {

    public int solution(){
        BigInteger factorial = new BigInteger("1");
        for(int i=1;i<=100;i++){
            factorial=factorial.multiply(new BigInteger(Integer.toString(i)));
        }
        String factorialString = factorial.toString();
        int ret=0;
        for (int i=0;i<factorialString.length();i++){
            ret+=(int)factorialString.charAt(i)-48;
        }
        return ret;
    }
}
