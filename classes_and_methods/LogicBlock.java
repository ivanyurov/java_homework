package java_homework.classes_and_methods;

/*
  Вывод программы:
    static logic
    logic (1) id= 0
    logic (2) id= 1
    ctor id= 100
*/


final class A {
    // Выведет id по умолчанию (logic (1) id= 0), вторая строка
    {
        System.out.println("logic (1) id= " + this.id);
    }

    // Выведет static logic в самом начале (т. к. static выполняется при первом обращении, до создания объекта)
    static {
        System.out.println("static logic");
    }

    private int id = 1;

    // Выведет ctor id= 100 четвертой строкой
    public A(int id) {
        this.id = id;
        System.out.println("ctor id= " + id);
    }

    // Выведет третьей строкой logic (2) id= 1, т. к. присвоено выше.
    {
        System.out.println("logic (2) id= " + id);
    }
}

public class LogicBlock {
    public static void main(String[] args) {
        new A(100);
    }
}