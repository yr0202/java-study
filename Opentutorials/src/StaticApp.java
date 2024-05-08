class Foo{
    public static String classVar = "I class var";
    public String instanceVar = "I instance var";
    public static void classMethod(){
        System.out.println(classVar); //ok
//        System.out.println(instanceVar); //error
    }
    public void instanceMethod(){
        System.out.println(classVar); //ok
        System.out.println(instanceVar); //ok
    }
}

public class StaticApp {
    public static void main(String[] args) {
        //System.out.println(Foo.classVar); //OK
//        System.out.println(Foo.instaneVar); //Error
        //static = class method
        // no static = instance method

        //Foo.classMethod(); // ok
//        Foo.instanceMetho(); // error

        Foo f1 = new Foo();
        Foo f2 = new Foo();

        System.out.println(f1.classVar);//I class var
        System.out.println(f1.instanceVar);//I instance var

        f1.classVar = "changed by f1";
        System.out.println(Foo.classVar);//changed by f1
        System.out.println(f2.classVar);//changed by f1

        f1.instanceVar = "changed by f1";
        System.out.println(f1.instanceVar);//changed by f1
        System.out.println(f2.instanceVar);//I instance var
    }
}
