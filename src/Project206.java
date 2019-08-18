public class Project206 {
    public long solution(){
        for(long i = 1010101010; i<1389026623;i+=2){
            long square=i*i;
            boolean x = true;
            if(square%10!=0){
                continue;
            }
            square/=10;
            int n=9;
            while(square>0){
                square/=10;
                if(square%10!=n){
                    x=false;
                    break;
                }
                n--;
                square/=10;
            }
            if(x){
                System.out.println(i*i);
                return i;
            }
        }
        return 1;
    }
}
