import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Project22 {
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

    private String trianglestr = readAllBytesJava7("src/p022.txt");

    public long solution(){
        String[] namesArray = trianglestr.split("\",\"");
        Arrays.sort(namesArray);
        long ret=0;
        for(int i=0;i<namesArray.length;i++){
            ret+=(i+1)*alphaValue(namesArray[i]);
        }
        return ret;
    }

    private int alphaValue(String name){
        int ret=0;
        for(int i=0;i<name.length();i++){
            ret+=(int)name.charAt(i)-64;
        }
        return ret;
    }
}
