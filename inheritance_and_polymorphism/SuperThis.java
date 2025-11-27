package java_homework.inheritance_and_polymorphism;

public class SuperThis {

    // Практика 1

    static class Parent {
        int value = 10;

        Parent() {
            System.out.println("Parent constructor");
        }

        void show() {
            System.out.println("Parent show");
        }
    }

    static class Child extends Parent {
        int value = 20;

        Child() {
            super(); // вызов конструктора суперкласса
            System.out.println("Child constructor");
        }

        void display() {
            System.out.println(super.value); // доступ к полю суперкласса
            super.show(); // доступ к методу суперкласса
        }
    }

    // Практика 2

    static class A {
        int a = 5;

        void method() {
            System.out.println("A method");
        }
    }

    static class B extends A {
        // в B ничего не определено
    }

    static class C extends B {
        void method() {
            System.out.println("C method start");

            int x = super.a; // a берется из A
            System.out.println("super.a = " + x);

            super.method(); // вызывается метод из A

            System.out.println("C method end");
        }
    }

    // Практика 3

    static class D {
        int a;
        int b;
        int c;
        int z;

        public D() {
            this(0, 0, 0);
        }

        public D(int a) {
            this(a, 0, 0);
        }

        public D(int a, int b) {
            this(a, b, 0);
        }

        public D(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.z = 1;
        }
    }

    public static void main(String[] args) {

        System.out.println("использование super");
        Child child = new Child();
        child.display();

        System.out.println("\nповедение при наследовании");
        C obj = new C();
        obj.method();

        // this() в конструкторах
        D d1 = new D();
        D d2 = new D(10);
        D d3 = new D(10, 20);
        D d4 = new D(10, 20, 30);
    }
}
