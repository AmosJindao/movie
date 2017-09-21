package tests.jdk8.optional;

import java.util.Optional;

/**
 * @author amos
 * @date 2017-09-20
 *
 * orElse will execute anyway no matter whether the value is null or not;
 * orElseGet will execute only when the value is null.
 */
public class OrElseAndOrElseGet{
    public static void main(String[] args) {
        Optional.of("not Empty").orElse(myGet("not empty orElse"));
        Optional.empty().orElse(myGet("empty orElse"));

        System.out.println("==================");

        Optional.of("not Empty").orElseGet(() -> myGet("not empty orElseGet"));
        Optional.empty().orElseGet(() -> myGet("empty orElseGet"));
    }

    static String myGet(String indicator) {
        System.out.println("execute " + indicator);

        return "exec " + indicator;
    }
}
