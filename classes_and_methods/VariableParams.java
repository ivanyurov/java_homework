package java_homework.classes_and_methods;

public class VariableParams {

    // Метод с переменным числом int
    public void print(int... numbers) {
        System.out.println("Метод print(int...) вызван");
        for (int n : numbers) {
            System.out.println(n);
        }
    }

    // Перегруженный метод с переменным числом String
    public void print(String... strings) {
        System.out.println("Метод print(String...) вызван");
        for (String s : strings) {
            System.out.println(s);
        }
    }

    // Перегруженный метод с переменным числом Object
    public void print(Object... objs) {
        System.out.println("Метод print(Object...) вызван");
        for (Object o : objs) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        VariableParams demo = new VariableParams();

        int[] arr = {1, 2, 3};
        demo.print((int[]) arr);                        // вызовет print(int...)
        demo.print("a", "b", "c");          // вызовет print(String...)
        demo.print(1, "hello", 2.5);           // вызовет print(Object...)
    }
}

