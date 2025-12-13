package java_homework.classes_and_methods;

// Класс с разными уровнями доступа
class TestAccess {

    private int privateValue = 1; // доступен только внутри TestAccess
    int defaultValue = 2; // доступен только в этом пакете
    protected int protectedValue = 3; // доступен в этом пакете и в наследниках в других пакетах
    public int publicValue = 4; // доступен откуда угодно

    public void showValues() {
        System.out.println("Внутри TestAccess:");
        System.out.println("privateValue = " + privateValue);
        System.out.println("defaultValue = " + defaultValue);
        System.out.println("protectedValue = " + protectedValue);
        System.out.println("publicValue = " + publicValue);
    }
}

// Класс-наследник, находится в том же пакете
class ChildSamePackage extends TestAccess {

    public void showAccessible() {
        System.out.println("\nВнутри ChildSamePackage:");

        // privateValue недоступен
        // System.out.println(privateValue); - ошибка "is not visible"

        System.out.println("defaultValue = " + defaultValue);
        System.out.println("protectedValue = " + protectedValue);
        System.out.println("publicValue = " + publicValue);
    }
}

// Главный класс для запуска
public class AccessSpecifiers {
    public static void main(String[] args) {

        TestAccess obj = new TestAccess();
        obj.showValues();

        System.out.println("\nДоступ из main (того же пакета):");
        // privateValue недоступен
        // System.out.println(obj.privateValue); - ошибка "is not visible"

        System.out.println("defaultValue = " + obj.defaultValue);
        System.out.println("protectedValue = " + obj.protectedValue);
        System.out.println("publicValue = " + obj.publicValue);

        ChildSamePackage child = new ChildSamePackage();
        child.showAccessible();
    }
}
