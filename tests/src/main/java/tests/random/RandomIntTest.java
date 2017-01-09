package tests.random;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author amos
 * @date 2016-11-20
 */
public class RandomIntTest{
    public static void main(String[] args) {
        IntStream ints = new Random().ints(6,0,100);

//        ints.

        ints.forEach(i->{
            System.out.println(i);
        });
    }
}
