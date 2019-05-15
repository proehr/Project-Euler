import java.util.List;
import java.util.ArrayList;

public class Project23 {
    public int solution(){
        int[] arr = new int[28124];
        for(int i = 0; i<=28123; i++){
            arr[i]=i;
        }
        List<Integer> abundantList = new ArrayList<Integer>();
        for(int i = 0; i<=28123;i++){
            if(divisorsum(i)>i){
                abundantList.add(i);
            }
        }
        for(int i = 0;i<abundantList.size()-1;i++){
            for(int j=i;j<abundantList.size();j++){
                if(abundantList.get(i)+abundantList.get(j)<28124){
                    arr[abundantList.get(i)+abundantList.get(j)]=0;
                }
            }
        }
        int sum=0;
        for(int i = 0; i<=28123;i++){
            /*if(arr[i]!=0){
                System.out.println(i);
            }*/
            sum+=arr[i];
        }
        return sum;
    }

    private long divisorsum(long x){
        long ret = 0;
        for(int i=1;i<=x/2;i++){
            if(x%i==0){
                ret+=i;
            }
        }
        return ret;
    }
}
