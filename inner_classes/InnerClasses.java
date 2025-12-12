package java_homework.inner_classes;

public class InnerClasses {
    // поля внешнего класса
    private String outerPrivate = "outerPrivate";
    String outerDefault = "outerDefault";
    public String outerPublic = "outerPublic";

    // практика 1
    public class PublicInner {
        private String a;

        public PublicInner(String a) {
            this.a = a;
        }

        public void show() {
            System.out.println("PublicInner.a = " + a);
            // inner видит private поля outer
            System.out.println("PublicInner sees outerPrivate = " + outerPrivate);
        }
    }

    protected class ProtectedInner {
        String b;

        ProtectedInner(String b) {
            this.b = b;
        }

        public void show() {
            System.out.println("ProtectedInner.b = " + b);
        }
    }

    class DefaultInner { // package-private
        String c;

        DefaultInner(String c) {
            this.c = c;
        }

        public void show() {
            System.out.println("DefaultInner.c = " + c);
        }
    }

    private class PrivateInner {
        private String d;

        private PrivateInner(String d) {
            this.d = d;
        }

        private void secret() {
            System.out.println("PrivateInner.secret(): " + d);
        }

        public void show() {
            System.out.println("PrivateInner.d = " + d);
        }
    }

    // фабрика для private inner
    public PrivateInner makePrivateInner(String d) {
        return new PrivateInner(d);
    }

    // static nested (вложенный) классы
    public static class StaticPublicNested {
        private String s;

        public StaticPublicNested(String s) {
            this.s = s;
        }

        public void show() {
            System.out.println("StaticPublicNested.s = " + s);
        }
    }

    private static class StaticPrivateNested {
        private String s;

        private StaticPrivateNested(String s) {
            this.s = s;
        }

        public void show() {
            System.out.println("StaticPrivateNested.s = " + s);
        }
    }

    public static StaticPrivateNested makeStaticPrivate(String s) {
        return new StaticPrivateNested(s);
    }

    // практика 1
    void practice1() {
        System.out.println("Практика 1:");
        InnerClasses outer = this;

        // создать нестатические inner: через экземпляр outer
        PublicInner pi = outer.new PublicInner("A");
        pi.show();

        ProtectedInner prot = outer.new ProtectedInner("B");
        prot.show();

        DefaultInner def = outer.new DefaultInner("C");
        def.show();

        // PrivateInner нельзя создать извне класса, но мы внутри класса - можем:
        PrivateInner priv = new PrivateInner("D");
        priv.show();

        // Или через фабрику (публичный метод)
        PrivateInner priv2 = makePrivateInner("D2");
        priv2.show();

        // static nested
        StaticPublicNested sp = new StaticPublicNested("S1");
        sp.show();

        // private static nested создаётся только внутри класса (через фабрику)
        StaticPrivateNested sp2 = makeStaticPrivate("S2");
        sp2.show();

        System.out.println();
    }

    // практика 2
    void practice2() {
        System.out.println("Практика 2:");
        PublicInner pi = new PublicInner("forAccess");
        // внутри inner мы уже показали доступ к outerPrivate в PublicInner.show()
        pi.show();

        // static nested НЕ имеет ссылки на экземпляр outer, поэтому не может обращаться
        // к нестатическим полям
        StaticPublicNested sp = new StaticPublicNested("staticTry");
        sp.show();
        System.out.println("StaticNested cannot access non-static outer fields.");
        System.out.println();
    }

    // практика 3
    void practice3() {
        System.out.println("Практика 3:");
        PublicInner pi = new PublicInner("outerReads");
        // outer (мы) можем читать приватное поле inner, потому что код в том же
        // top-level классе
        System.out.println("Outer reads PublicInner.a directly: " + pi.a);

        // outer может вызывать private методы inner (если мы в том же top-level классе)
        PrivateInner priv = makePrivateInner("secretD");
        // хоть method secret() приватна, Outer всё равно может её вызвать
        priv.secret();

        System.out.println();
    }

    public static void main(String[] args) {
        InnerClasses demo = new InnerClasses();
        demo.practice1();
        demo.practice2();
        demo.practice3();

        // извне (в main, но в том же классе) доступ к
        // приватному inner полю уже показан выше.
        // Если бы мы были в другом классе, попытка `outer.new PrivateInner(...)` или
        // чтение priv.a была бы недоступна.
    }
}
