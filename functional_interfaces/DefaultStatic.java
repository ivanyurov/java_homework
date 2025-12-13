package java_homework.functional_interfaces;

// DefaultStaticDemo.java

interface Greeter {
    // default (неабстрактный) метод
    default void greet() {
        System.out.println("Greeter: hello (default)");
    }

    // static метод интерфейса
    static void util() {
        System.out.println("Greeter.static util()");
    }
}

class GreeterImpl implements Greeter {
    // ничего не переопределяем - используем default из интерфейса
}

class GreeterOverride implements Greeter {
    @Override
    public void greet() {
        System.out.println("GreeterOverride: hello (overridden)");
    }
}

// Практика 2:
// Два интерфейса с одинаковым default-методом.
// Класс, реализующий оба, обязан переопределить метод.

interface A {
    default void common() {
        System.out.println("A.common()");
    }
}

interface B {
    default void common() {
        System.out.println("B.common()");
    }
}

class AB implements A, B {
    // нужно разрешить конфликт; можно вызвать конкретную реализацию через
    // InterfaceName.super.method()
    @Override
    public void common() {
        System.out.print("AB.common() -> delegating to A then B: ");
        A.super.common();
        B.super.common();
    }
}

public class DefaultStatic {
    public static void main(String[] args) {
        // Вызовы для Практики 1
        Greeter.util(); // вызов static метода интерфейса

        GreeterImpl impl = new GreeterImpl();
        impl.greet(); // вызов default метода через экземпляр реализации

        Greeter ref = new GreeterImpl();
        ref.greet(); // через ссылку типа интерфейса

        GreeterOverride go = new GreeterOverride();
        go.greet(); // переопределённый метод в классе

        System.out.println(); // разделитель вывода

        // Практика 2
        AB ab = new AB();
        ab.common();

        // если бы в AB не было переопределения common(), код не скомпилировался бы
    }
}
