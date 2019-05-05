import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Project67 extends Project18 {

    private static String readAllBytesJava7(String filePath)
    {
        String content = "";

        try
        {
            content = new String ( Files.readAllBytes( Paths.get(filePath) ) );
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return content;
    }

    private String trianglestr = readAllBytesJava7("src/p067.txt");

    public int solution(){
        String[] array = trianglestr.split("(\n" +
                "|\n" +
                "| )");
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
        System.out.println(Arrays.deepToString(triangle));
        for(int i=triangle.length-2;i>=0;i--){
            for(int j=0;j < triangle[i].length;j++){
                if(triangle[i+1][j]>triangle[i+1][j+1]){
                    triangle[i][j]+=triangle[i+1][j];
                }else{
                    triangle[i][j]+=triangle[i+1][j+1];
                }
            }
        }
        System.out.println(Arrays.deepToString(triangle));
        return triangle[0][0];

    }

}
