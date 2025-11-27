package java_homework.inheritance_and_polymorphism;

public class Overloads {

    // Практика 1

    static class OverloadExample {
        void print(int x) {
            System.out.println("print(int): " + x);
        }

        void print(String s) {
            System.out.println("print(String): " + s);
        }

        void print(int x, int y) {
            System.out.println("print(int, int): " + x + ", " + y);
        }
    }

    // Практика 2

    static class Parent {
        String getName() {
            return "Parent";
        }
    }

    static class Child extends Parent {
        @Override
        String getName() {
            return "Child";
        }

        // Если тип возвращаемого значения не совпадает, например int getName()
        // то будет ошибка "The return type is incompatible with
        // Overloads.Parent.getName()""
    }

    // Практика 3

    static class WrongOverrideParent {
        void doWork() {
            System.out.println("Parent work");
        }
    }

    static class WrongOverrideChild extends WrongOverrideParent {

        // @Override
        // void dowork() { // ошибка в регистре буквы W
        // System.out.println("Child work");
        // }

        // если убрать @Override, метод dowork() просто станет новым методом
        // если @Override есть то будет ошибка компиляции "The method dowork() of type
        // Overloads.WrongOverrideChild must override or implement a supertype method"
    }

    public static void main(String[] args) {

        System.out.println("Overloading");
        OverloadExample ov = new OverloadExample();
        ov.print(10);
        ov.print("hello");
        ov.print(5, 7);

        System.out.println("\nOverriding");
        Parent p = new Parent();
        Parent c = new Child();
        System.out.println(p.getName());
        System.out.println(c.getName());
    }
}
