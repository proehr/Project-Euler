public class Project21 {
    public long solution(){
        long sum=0;
        for(int a=220;a<10000;a++){
            long b = divisorsum(a);
            if(a==divisorsum(b) && b<10000 && a!=b){
                sum+=a;
                System.out.println(a + " " + b);
            }
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
