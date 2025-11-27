package java_homework.inheritance_and_polymorphism;

class A {
    public static void method() {
        System.out.println("A.method()");
    }
}

class B extends A {
    public static void method() {
        System.out.println("B.method()");
    }
}

public class StaticOverride {
    public static void main(String[] args) {
        A obj1 = new A();
        A obj2 = new B();
        B obj3 = new B();

        obj1.method(); // A.method()
        obj2.method(); // A.method(), а не B.method()
        obj3.method(); // B.method()
        // т. к. static, то метод принадлежит классу, а не экземпляру, поэтому он
        // определяется на этапе компиляции, что противоречит динамическому полиформизму
    }
}
