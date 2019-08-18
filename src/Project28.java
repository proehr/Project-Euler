import java.util.Arrays;

public class Project28 {
    public long solution(){
        int[][] spiral = new int[1001][1001];
        int n=500;
        int m=500;
        for(int i=1;i<=1002001;i++){
            spiral[n][m]=i;
            if(n<=m && n<1001-m){
                m++;
            }else if(n<m && n>=1001-m){
                n++;
            }else if(n>=m && n>=1001-m){
                m--;
            }else if(n>m && n<=1001-m){
                n--;
            }
        }
        long ret=0;
        for(int i=0;i<1001;i++){
            ret+=spiral[i][i] + spiral[i][1000-i];
        }
        return ret - 1;
    }
}
