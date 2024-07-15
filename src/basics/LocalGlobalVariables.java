package basics;

public class LocalGlobalVariables {

    int age = 10;

    int getAge(){
        int age = 30;
        return age;
    }

    public static void main(String[] args) {
        LocalGlobalVariables localGlobalVariables = new LocalGlobalVariables();
        System.out.println(localGlobalVariables.age);
        System.out.println(localGlobalVariables.getAge());
    }

}
