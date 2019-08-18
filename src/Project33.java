public class Project33 {

    public int solution(){
        int ireturn=1;
        int jreturn=1;
        for(int i=10;i<100;i++){
            for(int j=10;j<i;j++){
                String iString = Integer.toString(i);
                String jString = Integer.toString(j);
                int jnew = 0;
                int inew = 0;
                if(jString.contains(String.valueOf(iString.charAt(0)))){
                    int positionInJ= jString.indexOf(String.valueOf(iString.charAt(0)));
                    if(positionInJ==0){
                        jnew=j%10;
                    }else{
                        jnew=j/10;
                    }
                    inew=i%10;
                }else if(jString.contains(String.valueOf(iString.charAt(1))) && iString.charAt(1)!='0'){
                    int positionInJ= jString.indexOf(String.valueOf(iString.charAt(1)));
                    if(positionInJ==0){
                        jnew=j%10;
                    }else{
                        jnew=j/10;
                    }
                    inew=i/10;
                }else{
                    continue;
                }
                if(j/(double)i==jnew/(double)inew){
                    jreturn*=jnew;
                    ireturn*=inew;
                    System.out.println( jreturn + "/" + ireturn);
                }

            }
        }
        ireturn=shorten(jreturn,ireturn);
        return ireturn;
    }

    private int shorten(int x, int y){
        int gcd=GCD(x,y);
        return y/gcd;

    }

    public int GCD(int a, int b){
        if (b==0) return a;
        return GCD(b,a%b);
    }
}
