public class Project30 {
    public long solution(){
        long ret = 0;
        for(int i=11;i<355000;i++){

            int n = i;
            int sum = 0;
            int zeroCount = 0;
            while(n>0){
                if(n%10==0){
                    zeroCount++;
                }
                sum+=(int)Math.pow(n%10,5);
                n/=10;
            }
            if(i==Math.pow(10,zeroCount) || i==4*Math.pow(10,zeroCount) || i==9*Math.pow(10,zeroCount)){
                continue;
            }
            if(sum==i){
                System.out.println(i);
                ret+=i;
            }
        }
        return ret;
    }
}
