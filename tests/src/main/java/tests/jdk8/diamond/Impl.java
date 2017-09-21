package tests.jdk8.diamond;

/**
 * @author amos
 * @date 2017-09-18
 */
public class Impl implements Iface1,Iface2{
    public static void main(String[] args) {
        Impl impl = new Impl();
        System.out.println(impl.myMethod(3));
    }

    @Override
    public int myMethod(int x) {
        return 0;
    }
}
