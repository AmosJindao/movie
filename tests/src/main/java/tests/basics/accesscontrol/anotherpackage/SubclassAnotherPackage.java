package tests.basics.accesscontrol.anotherpackage;

import tests.basics.accesscontrol.ProtectedField;

/**
 * @author amos
 * @date 2017-09-16
 */
public class SubclassAnotherPackage extends ProtectedField{
    public static void main(String[] args) {
        printProtectedField();
    }
    static void printProtectedField(){
        //can not access the protectedField property in the super class ProtectedField.
        // because the super class in another package
//        System.out.println(new ProtectedField().protectedField);
    }
}
