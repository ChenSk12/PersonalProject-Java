import java.io.*;

public class CountChar {
    public static String countChar(String path) throws IOException {
        int charCount = 0;
        int ch = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
        while((ch=br.read())!=-1){
            if(ch<128&&ch>0)
            charCount++;
        }
        br.close();

        String charCountStr = "characters:"+Integer.toString(charCount)+"\n";
        return charCountStr;
    }
}
