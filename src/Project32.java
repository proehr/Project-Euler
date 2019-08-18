import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Project32 {

    public long solution(){
        Set<Integer> numbers = new HashSet<>();
        for(int i=1;i<10000;i++){
            String x = Integer.toString(i);
            int size = x.length();
            for(int j=1;j<10000;j++){
                int product=i*j;
                String digitString = i + "" + j + "" + product;
                boolean isPandigital = true;
                if(digitString.length()>9){
                    break;
                }
                for(int k=1;k<10;k++){
                    if(!digitString.contains(Integer.toString(k))){
                        isPandigital=false;
                        break;
                    }
                }
                if(isPandigital){
                    numbers.add(product);
                }
            }
        }
        long sum = 0;
        for(int number:numbers){
            System.out.println(number);
            sum+=number;
        }
        return sum;
    }
}
