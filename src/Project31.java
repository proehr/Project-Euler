public class Project31 {

    public int solution(){
        int max = 200;
        int ret = 0;
        for(int twoPound=max;twoPound>=0;twoPound-=200){
            for(int onePound=twoPound; onePound>=0;onePound-=100){
                for(int fiftyPence=onePound; fiftyPence>=0;fiftyPence-=50){
                    for(int twentyPence=fiftyPence;twentyPence>=0;twentyPence-=20){
                        for(int tenPence=twentyPence;tenPence>=0;tenPence-=10){
                            for(int fivePence=tenPence;fivePence>=0;fivePence-=5){
                                for(int twoPence=fivePence;twoPence>=0;twoPence-=2){
                                    ret++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return ret;
    }
}
