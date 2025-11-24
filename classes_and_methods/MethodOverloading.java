package java_homework.classes_and_methods;

public class MethodOverloading {

    public class A {
        public void printNum(Integer i) {
            System.out.printf("Integer = %d%n", i);
        }

        public void printNum(int i) {
            System.out.printf("int = %d%n", i);
        }

        public void printNum(Float f) {
            System.out.printf("Float = %.4f%n", f);
        }

        public void printNum(Number n) {
            System.out.println("Number=" + n);
        }
    }

    public static void main(String[] args) {
        MethodOverloading outer = new MethodOverloading();
        A a = outer.new A();
        Number[] num = { new Integer(1), 11, 1.11f, 11.11 };
        // цикл for (1)
        for (Number n : num) {
            // Будет выводить Number=... так как n - объект типа Number, будет использован
            // четвертый вариант
            a.printNum(n);
        }
        // (2)
        a.printNum(new Integer(1)); // вызовет первый, т. к. Integer
        a.printNum(11); // вызовет второй, т. к. int
        a.printNum(1.11f); // вызовет третий, т. к. float
        a.printNum(11.11); // вызовет четвертый, т. к. для double перегрузка не определена
    }
}