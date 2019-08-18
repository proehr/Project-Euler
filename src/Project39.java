import java.util.Arrays;

public class Project39 {

    public int solution(){
        int[] counter = new int[1000];
        for(int a=1;a<999;a++){
            for(int b=a;b<999;b++){
                int cSquared = a*a+b*b;
                double c =Math.sqrt(cSquared);
                if(c==(int)c && a+b+c<1000){
                    counter[a+b+(int)c]++;
                }
            }
        }
        int max=0;
        int maxp=0;
        for(int i=0;i<1000;i++){
            if(counter[i]>max){
                max=counter[i];
                maxp = i;
            }
        }
        return maxp;
    }
}

