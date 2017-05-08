package tests.jdk8.stream;

import com.google.common.base.Stopwatch;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * this test shows that stream for-each is slower than original for-each  in small size case, like 100, 1000 and so on.
 * Created on 2017/1/9.
 */
public class StreamTest {
    public static void main(String[] args) {
        Set<Integer> sets = genInts(1000000);

        Stopwatch stopwatch = Stopwatch.createUnstarted();

        stopwatch.start();
        for (Integer it : sets) {
            if (it > 10) {
                //ignore
            }
        }
        stopwatch.stop();

        System.out.println("original for-each:" + stopwatch.toString());

        stopwatch.reset();
        stopwatch.start();

//        sets.stream().filter((i) -> {
//            return i > 10;
//        }).forEach((j) -> {
//            //
//        });

        sets.stream().forEach((j) -> {
            if (j > 10) {
                //ignore
            }
        });
        stopwatch.stop();

        System.out.println("stream for-each:" + stopwatch.toString());
    }

    static Set<Integer> genInts(int streamSize) {
        streamSize = streamSize < 0 ? 0 : streamSize;

        IntStream intStream = new Random().ints(streamSize, 0, 1000);

        return intStream.collect(HashSet::new, (s, t) -> {
            s.add(t);
        }, (s1, s2) -> {
            s1.addAll(s2);
        });
    }
}
