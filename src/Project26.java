public class Project26 {

    private int cycleLength(int b){
        int a = 1;
        int count =0;
        do{
            a = (a*10) %b;
            count++;
        }while(a>1);
        System.out.println(b+ " "+count);
        return count;
    }

    public int solution(){
        int ret=0;
        int max=0;
        for(int i =2;i<1000;i++){
            if(i%2!=0 && i%5!=0) {
                int cL = cycleLength(i);
                if (cL > max) {
                    max = cL;
                    ret = i;
                }
            }
        }
        return ret;
    }
}
