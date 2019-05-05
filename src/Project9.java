public class Project9 {
    public int solution(){
        for(int a=1;a<=998;a++){
            for(int b=a+1;b<=999-a;b++){
                int c=1000-a-b;
                if(a*a + b*b == c*c){
                    return a*b*c;
                }
            }
        }
        return 0;
    }
}
