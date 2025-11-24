package java_homework.classes_and_methods;

public class Static {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {

        // Вызов по имени класса
        Static.printVars();

        // 2. Вызов через объект
        Static obj = new Static();
        obj.printVars();

        // 3. Вызов из другого статического метода того же класса напрямую
        printVars();

        // 4. Вызов через null ссылку
        Static nullRef = null;
        nullRef.printVars(); // работает, так как метод статический
    }
}
