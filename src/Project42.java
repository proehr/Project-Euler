import java.util.ArrayList;
import java.util.List;

public class Project42 {

    private List<Integer> triangleNumbers = new ArrayList<>();



    public int solution(){
        P042 p042 = new P042();
        String[] words = p042.words;
        for(int i=1;i<=100;i++){
            triangleNumbers.add(i*(i+1)/2);
        }
        int count = 0;
        for(int i =0 ; i<words.length;i++){
            if(isTriangleword(words[i])){
                count++;
                System.out.println(words[i]);
            }
        }
        return count;

    }

    private boolean isTriangleword(String word){
        int sum=0;
        for (int i=0;i<word.length();i++){
            sum+=(int)word.charAt(i)-(int)'A'+1;
        }
        if(triangleNumbers.contains(sum)){
            System.out.print(sum + " ");
            return true;
        }
        return false;
    }
}
