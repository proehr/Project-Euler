public class Project14 {
    public long solution(){
        int max=0;
        int ret=0;
        for(int i=1; i<1000000;i++){
            long x=i;
            int count=1;
            while(x!=1){
                if(x%2==0){
                    x/=2;
                }else{
                    x=3*x+1;
                }
                count++;
            }
            if(count>max){
                max=count;
                ret=i;
            }
        }
        return ret;
    }
}
