package tests.IO.image;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by liushengri on 2017/7/5.
 */
public class ImageFormatGeter {
    public static void main(String[] args) throws IOException {
//        new File("E:\\tmp\\image\\Chrysanthemum.jpg")
//        File file = new File("E:\\tmp\\image\\uid-123.png");
        

        testPicFormat();
    }
    
    public static void testPicFormat() throws FileNotFoundException {
        System.out.println("图片格式1： " + getPicType(new FileInputStream( new File("E:\\tmp\\image\\uid-123.png"))));
        System.out.println("图片格式2： " + getPicType(new FileInputStream( new File("E:\\tmp\\image\\Chrysanthemum.jpg"))));
        System.out.println("图片格式2： " + getPicType(new FileInputStream( new File("E:\\tmp\\image\\20140906072515_dZker.gif"))));
        System.out.println("图片格式2： " + getPicType(new FileInputStream( new File("E:\\tmp\\image\\20170705165021.png"))));
    }
    
    public static String bytesToHexString(byte[] src){
        StringBuilder stringBuilder = new StringBuilder();
        if (src == null || src.length <= 0) {
            return null;
        }
        for (int i = 0; i < src.length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }


    /**
     * 根据文件流判断图片类型
     * @param fis
     * @return jpg/png/gif/bmp
     */
    public static String getPicType(FileInputStream fis) {
        //读取文件的前几个字节来判断图片格式
        byte[] b = new byte[4];
        try {
            fis.read(b, 0, b.length);
            String type = bytesToHexString(b).toUpperCase();
            if (type.contains("FFD8FF")) {
                return TYPE_JPG;
            } else if (type.contains("89504E47")) {
                return TYPE_PNG;
            } else if (type.contains("47494638")) {
                return TYPE_GIF;
            } else if (type.contains("424D")) {
                return TYPE_BMP;
            }else{
                return TYPE_UNKNOWN;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    public static final String TYPE_JPG = "jpg";
    public static final String TYPE_GIF = "gif";
    public static final String TYPE_PNG = "png";
    public static final String TYPE_BMP = "bmp";
    public static final String TYPE_UNKNOWN = "unknown";
    
}
