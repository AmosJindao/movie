package tests.basics.accesscontrol;

/**
 * @author amos
 * @date 2017-09-16
 */
public class SubclassSameClass extends ProtectedField{
    public static void main(String[] args) {
        printProtectedField();
    }
    static void printProtectedField(){
        //can access the protectedField property in the super class ProtectedField.
        // because the super class is in same package.
                System.out.println(new ProtectedField().protectedField);
    }
}
