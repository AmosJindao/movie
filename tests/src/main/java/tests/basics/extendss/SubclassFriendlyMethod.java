package tests.basics.extendss;

/**
 * @author amos
 * @date 2017-09-16
 */
public class SubclassFriendlyMethod extends FriendlyMethodInheritence{
    public static void main(String[] args) {
        FriendlyMethodInheritence friendlyMethodInheritence = new SubclassFriendlyMethod();

        friendlyMethodInheritence.friendlyMethod();

        friendlyMethodInheritence.friendlyStaticMethod();
    }

    public void friendlyMethod(){
        System.out.println("subclass friendly method!");
    }

    public static void friendlyStaticMethod(){
        System.out.println("subclass friendly static method!");
    }
}
