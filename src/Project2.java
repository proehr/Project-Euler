public class Project2 {
    public int solution(){
        int f1=1;
        int f2=2;
        int ret=0;
        while(f2<4000000){
            if(f2%2==0){
                ret+=f2;
            }
            int foo=f2;
            f2+=f1;
            f1=foo;
        }
        return ret;
    }
}
