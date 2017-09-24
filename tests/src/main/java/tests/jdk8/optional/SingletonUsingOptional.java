package tests.jdk8.optional;

import java.util.Optional;

/**
 * @author amos
 * @date 2017-09-21
 */
public class SingletonUsingOptional{
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new Thread(() -> System.out.println(SingletonUsingOptional.getInstance())).start();
        }
    }

    private static SingletonUsingOptional instance = null;

    private SingletonUsingOptional() {
    }

    public static SingletonUsingOptional getInstance() {
        return Optional.ofNullable(instance).orElseGet(() -> createInstance());
    }

    private static synchronized SingletonUsingOptional createInstance() {
        instance = Optional.ofNullable(instance).orElseGet(SingletonUsingOptional::new);

        return instance;
    }
}
