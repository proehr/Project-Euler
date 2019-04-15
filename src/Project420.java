public class Project420 {
    public int solution(int n){
        int sum = 0;
        for(int x=10;x<n;x++){
            sum+=solution2(x);
        }
        return sum ;
        /*int sum = 0;
        for(int a=2;a<n-1;a++){
            for(int d=2;d<n-a;d++){
                for(int b=2;b<n*n;b++){
                    for(int c=b;c<((a*n - a*a)/b);c++){
                        double x = Math.sqrt((a*d)-(b*c));
                        if(a*d<=b*c){
                            continue;
                        }
                        double y1 = Math.sqrt(a+d+2*x);
                        double y2 = Math.sqrt(a+d-2*x);
                        if(a-x<=0 || d-x<=0){
                            continue;
                        }


                        if(checkIfInt((a-x)/y2) && checkIfInt((a+x)/y1) &&
                                checkIfInt(b/y1) && checkIfInt(c/y1) &&
                                checkIfInt(b/y2) && checkIfInt(c/y2) &&
                                checkIfInt((d-x)/y2) && checkIfInt((d+x)/y1)){
                            if(c==b) {
                                sum += 1;
                            }
                            else{ sum+=2;}
                            System.out.print(a + " ");
                            System.out.print(b+ " ");
                            System.out.print(c+ " ");
                            System.out.println(d);
                        }
                    }
                }
            }
        }
        return sum;*/
    }

    public int solution2(int n){
        int sum = 0;
        for(int a=2;a<n;a++){
            int d = n-a;
                for(int k=2;k<n/2;k++){
                    int bc= a*d - k*k;
                    if(!checkIfInt(Math.sqrt(a*d-bc))){
                        continue;
                    }
                    for(int b=2;b<Math.sqrt(bc)+1;b++){
                        if(!checkIfInt(bc*1.0/b)){continue;}
                        int c=bc/b;
                        double x = Math.sqrt((a*d)-(b*c));
                        if(a*d<=b*c){
                            continue;
                        }
                        double y1 = Math.sqrt(a+d+2*x);
                        double y2 = Math.sqrt(a+d-2*x);
                        if(a-x<=0 || d-x<=0){
                            continue;
                        }


                        if(checkIfInt((a-x)/y2) && checkIfInt((a+x)/y1) &&
                                checkIfInt(b/y1) && checkIfInt(c/y1) &&
                                checkIfInt(b/y2) && checkIfInt(c/y2) &&
                                checkIfInt((d-x)/y2) && checkIfInt((d+x)/y1)){
                            if(c==b) {
                                sum += 1;
                            }
                            else{ sum+=2;}
                            System.out.print(a + " ");
                            System.out.print(b+ " ");
                            System.out.print(c+ " ");
                            System.out.println(d);
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


}
