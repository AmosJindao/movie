package tests.str;

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
        
        String url = ":http://192.168.103.25:8088/order.html?bizModNo=1&itemList=[{\"skuNo\":\"275930120240267265\",\"purchaseQty\":1,\"redeemCode\":\"3D44CFE79C08000\",\"skuGrpNo\":\"900600000\"}]&custNo=278559599823491072";
   
        
   
    }
}
