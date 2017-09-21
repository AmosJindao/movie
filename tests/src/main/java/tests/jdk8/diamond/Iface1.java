package tests.jdk8.diamond;

/**
 * @author amos
 * @date 2017-09-18
 */
public interface Iface1{
    default int myMethod(int x){
        return 2*x;
    }
}
