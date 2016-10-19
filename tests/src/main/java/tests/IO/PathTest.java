package tests.IO;

import java.nio.file.Paths;

/**
 * @author amos
 * @date 20161003
 */
public class PathTest{
    public static void main(String[] args) {
        System.out.println(Paths.get("").toAbsolutePath());
    }
}
