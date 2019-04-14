public class Project420 {
    public int solution(int n){
        int sum = 0;
        for(int a=1;a<n;a++){
            for(int d=1;d<n-a;d++){
                for(int b=1;b<n*n;b++){
                    for(int c=1;c<n*n;c++){
                        double x = Math.sqrt((a*d)-(b*c));
                        if(a*d==b*c){
                            continue;
                        }
                        double y = Math.sqrt(a+d+2*x);
                        if(!checkIfPositive(a,d,x)){
                            continue;
                        }
                        //System.out.print(a + " ");
                        //System.out.print(b+ " ");
                        //System.out.println(c+ " ");
                        //System.out.println(d);

                        if(checkIfInt((a-x)/y) && checkIfInt((a+x)/y) &&
                                checkIfInt(b/y) && checkIfInt(c/y) &&
                                checkIfInt((d-x)/y) && checkIfInt((d+x)/y)){
                            sum+=1;
                        }
                    }
                }
            }
        }
        return sum;
    }


    public boolean checkIfInt(double x){
        if(x == 0){
            return false;
        }
        if((int)x==x){
            return true;
        }
        return false;
    }

    public boolean checkIfPositive(int a, int d, double x){
        if(a-x<=0 || d-x<=0){
            return false;
        }
        return true;
    }
}
