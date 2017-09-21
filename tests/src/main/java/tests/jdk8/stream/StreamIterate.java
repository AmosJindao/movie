package tests.jdk8.stream;

import java.util.stream.Stream;

/**
 * @author amos
 * @date 2017-09-20
 */
public class StreamIterate{

    public static void main(String[] args) {
        generateOddIntStream().forEach(odd -> System.out.println(odd));
    }

    static Stream<Integer> generateOddIntStream() {
        return Stream.iterate(1, n -> n + 2).filter(odd -> odd >= 9).limit(4);
    }

}
