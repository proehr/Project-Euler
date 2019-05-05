public class Project17 {
    private int below20(int n){
        if(n==0){
            return 0;
        }
        if(n==1 || n==2 || n==6 || n==10){
            return 3;
        }
        if(n==4 || n==5 || n==9){
            return 4;
        }
        if(n==3 || n==7 || n==8){
            return 5;
        }
        if(n==11 || n==12){
            return 6;
        }
        if(n==15 || n==16){
            return 7;
        }
        if(n==13 || n==14 || n==18 || n==19){
            return 8;
        }
        return 9;
    }

    private int tens(int n){
        if(n>=40 && n<=69) {
            return 5;
        }
        if(n/10==7){
            return 7;
        }
        return 6;
    }

    private int count(int n){
        int foo=0;
        if(n<20){
            return below20(n);
        }
        if(n%100<20){
            foo+=below20(n%100);
        }else{
            foo+=tens(n%100);
            foo+=below20(n%10);
        }
        if(n>=100){
            foo+=below20(n/100);
            foo+=7;
            if(n%100!=0){
                foo+=3;
            }
        }
        return foo;
    }

    public long solution(){
        long ret=0;
        for(int i=1;i<=999;i++) {
            ret += count(i);
            System.out.println(i + " " + count(i));
        }
        ret+=11;
        return ret;
    }
}
