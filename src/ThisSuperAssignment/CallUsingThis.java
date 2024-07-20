/**
 * @author : ashis
 * @Date : 7/18/2024
 * @Time : 12:58 PM
 * @Project Name : JalaAcademy_Java_Assignment
 */
package ThisSuperAssignment;


public class CallUsingThis {

    int age ;
    String name;

    public CallUsingThis() {
        this(11,"java");
    }

    public CallUsingThis(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString(){
        return "name : " + this.name +" \n" + "age : " + this.age;
    }
    public static void main(String[] args) {
        CallUsingThis callUsingThis = new CallUsingThis();
        CallUsingThis callUsingThis1 = new CallUsingThis(12,"learning");
        System.out.println(callUsingThis1);
        System.out.println(callUsingThis);
    }
}
