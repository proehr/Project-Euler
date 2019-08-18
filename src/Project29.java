import java.util.Set;
import java.util.HashSet;
import java.math.BigInteger;

public class Project29 {

    public int solution(){
        Set<BigInteger> set = new HashSet<>();
        for(int a=2; a<=100;a++){
            BigInteger x = new BigInteger(String.valueOf(a));
            for(int b=2;b<=100;b++){
                 set.add(x.pow(b));
            }
        }
        return set.size();
    }
}
