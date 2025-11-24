package java_homework.classes_and_methods;

public class Methods {

    // перегрузка метода
    public static class Calculator {

        // метод без аргументов
        public int sum() {
            return 0;
        }

        // метод с одним аргументом
        public int sum(int a) {
            return a;
        }

        // метод с двумя аргументами
        public int sum(int a, int b) {
            return a + b;
        }

        // метод с тремя аргументами
        public int sum(int a, int b, int c) {
            return a + b + c;
        }
    }

    // переопределение метода
    public static class Parent {
        public void show() {
            System.out.println("Метод в Parent");
        }
    }

    public static class Child extends Parent {
        @Override
        public void show() {
            System.out.println("Метод в Child");
        }
    }

    public static void main(String[] args) {

        System.out.println("Перегрузка методов");
        Calculator calc = new Calculator();
        System.out.println("sum() = " + calc.sum());
        System.out.println("sum(5) = " + calc.sum(5));
        System.out.println("sum(3, 7) = " + calc.sum(3, 7));
        System.out.println("sum(1, 2, 3) = " + calc.sum(1, 2, 3));

        System.out.println("\nПереопределение методов");
        Parent p = new Parent();
        Parent c = new Child();

        p.show(); // вызов версии из Parent
        c.show(); // вызов переопределенной версии из Child
    }
}
