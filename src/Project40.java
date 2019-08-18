public class Project40 {

    public int solution(){
        int count=0;
        int ret=1;
        int n=0;
        int sizeOfIterator=0;
        int iterator=1;
        while(count<=1000000){
            if(iterator==Math.pow(10,sizeOfIterator)){
                sizeOfIterator++;
            }
            count+=sizeOfIterator;
            if(count>=Math.pow(10,n)){
                int delta = count-(int)Math.pow(10,n);
                ret*=(iterator/(int)Math.pow(10,delta)) %10;
                System.out.println((iterator/(int)Math.pow(10,delta)) %10);
                n++;
            }
            iterator++;
        }
        return ret;
    }
}
