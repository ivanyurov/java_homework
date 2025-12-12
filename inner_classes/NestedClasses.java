package java_homework.inner_classes;

public class NestedClasses {

    public static void main(String[] args) {
        // создание объекта вложенного класса интерфейса
        MyInterface.Helper h = new MyInterface.Helper();
        h.sayHello();

        MyInterface.Calculator calc = new MyInterface.Calculator();
        System.out.println("5 + BASE = " + calc.addBase(5));
    }
}

// интерфейс
interface MyInterface {

    int BASE = 10;  // доступно вложенному классу (static final)

    // вложенный класс (автоматически public static)
    class Helper {
        public void sayHello() {
            System.out.println("Hello from Helper inside interface!");
        }
    }

    // ещё один вложенный класс
    class Calculator {
        public int addBase(int x) {
            return x + BASE; // доступно, потому что BASE — static
        }
    }
}

