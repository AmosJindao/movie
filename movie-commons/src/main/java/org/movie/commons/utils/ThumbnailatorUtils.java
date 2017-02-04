package org.movie.commons.utils;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/**
 * Created on 2017/1/24.
 */
public class ThumbnailatorUtils {
    
    public static void waterMark(String fromImagePath, String toImagePath){
        try {
            //new File("image/huhx.jpg")
            Thumbnails.of(fromImagePath)
                    .watermark(Positions.CENTER, ImageIO.read(new File("image/water.jpg")), 0.5f)
                    .outputQuality(0.8f).toFile(toImagePath);
            //new File("photo/huhx3.jpg")
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
