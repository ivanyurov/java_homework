package java_homework.inheritance_and_polymorphism;

public class Inheritance {

    // Практика 1

    static class A {
        int x = 10;

        A() {
            System.out.println("A(): x=" + x);
        }

        void show() {
            System.out.println("A.show(): x=" + x);
        }
    }

    static class B extends A {
        int x = 20;

        B() {
            super(); // вызов конструктора A
            System.out.println("B(): this.x=" + this.x + ", super.x=" + super.x);
        }

        @Override
        void show() {
            super.show(); // вызов метода A
            System.out.println("B.show(): x=" + this.x);
        }
    }

    // Практика 2

    static class A2 {
        int a1 = 1; // default
        public int a2 = 2; // public
        protected int a3 = 3;// protected
        private int a4 = 4; // private

        void m1() {
        } // default

        public void m2() {
        } // public

        protected void m3() {
        } // protected

        private void m4() {
        } // private
    }

    static class B2 extends A2 {
        void test() {
            System.out.println("From B2:");
            System.out.println(a1); // default - видно (один пакет)
            System.out.println(a2); // public - видно
            System.out.println(a3); // protected - видно
            // System.out.println(a4); // private - ошибка

            m1(); // default
            m2(); // public
            m3(); // protected
            // m4(); // private - ошибка
        }
    }

    static class C2 extends B2 {
        void test() {
            System.out.println("From C2:");
            System.out.println(a1); // default - видно (один пакет)
            System.out.println(a2); // public
            System.out.println(a3); // protected
            // System.out.println(a4); // private - ошибка
        }
    }

    public static void main(String[] args) {

        System.out.println("Практика 1");
        B b = new B();
        b.show();

        System.out.println("\nПрактика 2");
        B2 b2 = new B2();
        b2.test();

        C2 c2 = new C2();
        c2.test();
    }
}
