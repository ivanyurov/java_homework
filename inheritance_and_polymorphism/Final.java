package java_homework.inheritance_and_polymorphism;

public class Final {

    // Практика 1

    static class Parent {
        public final void doWork() {
            System.out.println("Parent final method");
        }
    }

    static class Child extends Parent {
        // Попытка переопределения вызовет ошибку компиляции:
        // public void doWork() { }
        // Ошибка: cannot override the final method from Final.Parent
    }

    // Практика 2

    final static class FinalClass {
        public void show() {
            System.out.println("FinalClass method");
        }
    }

    // Попытка наследования вызовет ошибку компиляции:
    // static class SubFinal extends FinalClass { }
    // Ошибка: The type SubFinal cannot subclass the final class Final.FinalClass

    public static void main(String[] args) {

        Parent p = new Parent();
        p.doWork();

        FinalClass f = new FinalClass();
        f.show();

        System.out.println("Программа скомпилируется только если закомментить ошибки выше");
    }
}
