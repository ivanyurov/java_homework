package java_homework.interfaces_and_annotations;

// AnnotationsDemo.java

import java.util.ArrayList;
import java.util.List;

class Parent {
    public String getName() {
        return "Parent";
    }
}

class Child extends Parent {
    // метод переопределен от родителя
    @Override
    public String getName() {
        return "Child";
    }
}

// класс и метод помечены как устаревшие
@Deprecated
class OldClass {
    @Deprecated
    public void oldMethod() {
        System.out.println("oldMethod called");
    }
}

public class Annotations {
    public static void main(String[] args) {

        // @Override
        Child c = new Child();
        System.out.println(c.getName());

        // @Deprecated вызовет предупреждение, но программа работает
        OldClass oc = new OldClass();
        oc.oldMethod();

        // @SuppressWarnings отключает предупреждение о сыром типе (у меня в vscode все
        // равно вылазит предупреждение)
        @SuppressWarnings("unchecked")
        List list = new ArrayList();
        list.add("text");
        System.out.println(list.get(0));
    }
}
