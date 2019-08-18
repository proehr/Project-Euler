public class Project34 {

    public int solution(){
        int[] factorials = new int[10];
        factorials[0]=1;
        int returnSum=0;
        for(int i=1;i<10;i++){
            factorials[i]=factorials[i-1]*i;
        }
        for(int i=10;i<=factorials[9]*10;i++){
            String number = Integer.toString(i);
            int digitSum = 0;
            for(int j =0;j<number.length();j++){
                digitSum+=factorials[(int)number.charAt(j)-48];
            }
            if(i==digitSum){
                returnSum+=i;
            }
        }
        return returnSum;
    }
}
