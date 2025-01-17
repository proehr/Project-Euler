import java.util.Arrays;

public class Project18 {
    private String trianglestr = "75 "+
            "95 64 "+
            "17 47 82 "+
            "18 35 87 10 "+
            "20 04 82 47 65 "+
            "19 01 23 75 03 34 "+
            "88 02 77 73 07 63 67 "+
            "99 65 04 28 06 16 70 92 "+
            "41 41 26 56 83 40 80 70 33 "+
            "41 48 72 33 47 32 37 16 94 29 "+
            "53 71 44 65 25 43 91 52 97 51 14 "+
            "70 11 33 28 77 73 17 78 39 68 17 57 "+
            "91 71 52 38 17 14 91 43 58 50 27 29 48 "+
            "63 66 04 68 89 53 67 30 73 16 69 87 40 31 "+
            "04 62 98 27 23 09 70 98 73 93 38 53 60 04 23";

    public int solution(){
        String[] array = trianglestr.split(" ");
        int[][] triangle = new  int[(int)(-0.5+Math.sqrt(0.25+2*array.length))][];
        int x = -1;
        int y = 0;
        for(int i=0; i<array.length;i++){
            if(-0.5+Math.sqrt(0.25+2*i)==Math.floor(-0.5+Math.sqrt(0.25+2*i))){
                x++;
                y=0;
                triangle[x]=new int[x+1];
            }
            triangle[x][y]= Integer.parseInt(array[i]);
            y++;

        }
        for(int i=triangle.length-2;i>=0;i--){
            for(int j=0;j < triangle[i].length;j++){
                if(triangle[i+1][j]>triangle[i+1][j+1]){
                    triangle[i][j]+=triangle[i+1][j];
                }else{
                    triangle[i][j]+=triangle[i+1][j+1];
                }
            }
        }
        return triangle[0][0];

    }

}
