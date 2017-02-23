package tests.str;

import org.apache.commons.codec.binary.Hex;

/**
 * Created by liushengri on 2017/2/22.
 */
public class ReplaceStrTest {
    public static void main(String[] args) {
        String pathStr = "E:\\java\\math\\123.jpeg";
        
        int winIdx = pathStr.indexOf("\\");
        
        if(winIdx >= 0){
            pathStr = pathStr.substring(winIdx);
            
            pathStr = pathStr.replace("\\","/");
        }

        System.out.println(pathStr);

//      Hex.decodeHex()
    }
}
