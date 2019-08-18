import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Project81 {

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

    private String matrixstr = readAllBytesJava7("src/p081.txt");

    public int solution(){
        String[] array = matrixstr.split("," +
                "|\n");
        int[][] matrix = new int[80][80];
        int[][] d = new int[80][80];
        for(int i = 0;i<80;i++){
            for(int j = 0; j<80;j++){
                matrix[i][j]=Integer.parseInt(array[i*80+j]);
                d[i][j]=Integer.MAX_VALUE;
            }
        }
        d[0][0]=matrix[0][0];
        for(int i = 0;i<80;i++){
            for(int j = 0; j<80;j++){
                if(i<79){
                    int weightdown = matrix[i+1][j];
                    if(d[i+1][j]>d[i][j]+weightdown){
                        d[i+1][j]=d[i][j]+weightdown;
                    }
                }
                if(j<79) {
                    int weightright = matrix[i][j + 1];
                    if (d[i][j + 1] > d[i][j] + weightright) {
                        d[i][j + 1] = d[i][j] + weightright;
                    }
                }
            }
        }
        return d[79][79];

    }
}
