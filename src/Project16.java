import java.math.BigInteger;

public class Project16 {

    public int solution(){
        BigInteger ret = new BigInteger("2");
        for(int i=2;i<=1000;i++){
            ret = ret.multiply(new BigInteger("2"));
        }
        String retString = ret.toString();
        int sol = 0;
        for(int i=0; i<retString.length();i++){
            sol+=(int)retString.charAt(i)-48;
        }
        return sol;
    }
}
