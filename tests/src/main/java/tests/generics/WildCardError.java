package tests.generics;

import java.util.List;

/**
 * the error showed below is mentioned
 * on https://docs.oracle.com/javase/tutorial/java/generics/capture.html
 * @author amos
 * @date 2017-09-25
 */
public class WildCardError{

    void foo(List<?> i) {
//        i.set(0, i.get(0)); // here is a compiler error.
    }

    void foo2(List<?> i) {
        fooHelper(i);
    }


    // Helper method created so that the wildcard can be captured
    // through type inference.
    private <T> void fooHelper(List<T> l) {
        l.set(0, l.get(0));
    }

}
