public class Project1 {

    private int calc(int n, int div){
        int max=(n-1)/div;
        return div*max*(max+1)/2;
    }

    public int solution(){
       return calc(1000,3)+calc(1000,5)-calc(1000,15);
    }

}
