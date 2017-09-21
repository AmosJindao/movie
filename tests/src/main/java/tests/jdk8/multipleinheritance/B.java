package tests.jdk8.multipleinheritance;

/**
 * @author amos
 * @date 2017-09-18
 */
public interface B extends A{
    default int myMethod() {
        return 5;
    }
}
