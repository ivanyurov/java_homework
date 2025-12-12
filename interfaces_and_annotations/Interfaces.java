package java_homework.interfaces_and_annotations;

// InterfaceVisibilityDemo.java

public class Interfaces {
    public static void main(String[] args) {

        // интерфейс без модификатора — доступен только в этом же пакете
        PackageInterface pi = new PackageInterfaceImpl();
        pi.say();

        // public интерфейс — доступен отовсюду, но нужен отдельный файл
        // PublicInterface pub = new PublicInterfaceImpl();
    }
}

// Практика 1

// интерфейс без модификатора — package-private
interface PackageInterface {
    void say();
}

class PackageInterfaceImpl implements PackageInterface {
    public void say() {
        System.out.println("PackageInterface: доступен только внутри пакета.");
    }
}

// Практика 2

// public интерфейс — доступен откуда угодно, но нужен отдельный файл
// public interface PublicInterface {
// void say();
// }

// Практика 3

// НЕЛЬЗЯ: protected интерфейс верхнего уровня запрещён
// protected interface ProtectedInterface { }

// Практика 4

// НЕЛЬЗЯ: private интерфейс верхнего уровня запрещён
// private interface PrivateInterface { }
