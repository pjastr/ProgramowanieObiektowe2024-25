public class Main {

    public static void main(String[] args) {
        BaseClass.staticMethod();
        DerivedClass.staticMethod();
        BaseClass o1 = new BaseClass();
        o1.instanceMethod();
        DerivedClass o2 = new DerivedClass();
        o2.instanceMethod();
        BaseClass o3 = new DerivedClass();
        o3.instanceMethod();
        //DerivedClass o4 = new BaseClass();
        DerivedClass o5 = new DerivedClass();
        BaseClass o6 =  (BaseClass) o5;
        DerivedClass o7 = (DerivedClass) o6;
    }
}


class BaseClass {
    public static void staticMethod() {
        System.out.println("Static method in BaseClass");
    }

    public void instanceMethod() {
        System.out.println("Instance method in BaseClass");
    }
}

class DerivedClass extends BaseClass {
    public static void staticMethod() {
        System.out.println("Static method in DerivedClass");
    }

    @Override
    public void instanceMethod() {
        System.out.println("Instance method in DerivedClass");
    }
}