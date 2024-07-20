/**
 * @author : ashis
 * @Date : 7/17/2024
 * @Time : 6:34 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package Modifiers.package2;

import Modifiers.package1.DefaultClassFieldsMethod;
import Modifiers.package1.PrivateFieldsMethods;
import Modifiers.package1.ProtectedClassFieldsMethod;
import Modifiers.package1.PublicClassFieldsMethods;

public class AccessingProtectedFieldsMethod extends ProtectedClassFieldsMethod{

    public static void main(String[] args) {
        AccessingProtectedFieldsMethod accessingProtectedFieldsMethod = new AccessingProtectedFieldsMethod();
        accessingProtectedFieldsMethod.protectedMethod();


        PublicClassFieldsMethods publicClassFieldsMethods = new PublicClassFieldsMethods();
        publicClassFieldsMethods.publicMethod();


//        Default and private method cannot be accesible from the parent class;
    }
}
