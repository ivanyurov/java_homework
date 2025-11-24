package java_homework.classes_and_methods;

public class Final {

    // инициализация при объявлении
    public class A {
        public final int a = 10;
    }

    //инициализация в конструкторе
    public class B {
        public final int b;

        public B(int value) {
            b = value;
        }
    }

    //инициализация в блоке инициализации экземпляра
    public class C {
        public final int c;

        {
            c = 20;
        }
    }

    public static void main(String[] args) {

        Final outer = new Final();
        A tmpA = outer.new A();
        System.out.println(tmpA.a);
        B tmpB = outer.new B(15);
        System.out.println(tmpB.b);
        C tmpC = outer.new C();
        System.out.println(tmpC.c);

    }

}
