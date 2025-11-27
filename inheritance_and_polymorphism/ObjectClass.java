package java_homework.inheritance_and_polymorphism;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Person person = (Person) o;

        if (age != person.age)
            return false;

        return name != null ? name.equals(person.name) : person.name == null;
    }

    // Всегда переопределяется вместе с equals()
    @Override
    public int hashCode() {
        int result = (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }
}

public class ObjectClass {

    public static void main(String[] args) {

        Person p1 = new Person("Chelick", 22);
        Person p2 = new Person("Chelick", 22);
        Person p3 = new Person("Bob", 30);

        System.out.println("p1.equals(p2) -> " + p1.equals(p2)); // true
        System.out.println("p1.equals(p3) -> " + p1.equals(p3)); // false
        System.out.println("p1.equals(null) -> " + p1.equals(null)); // false
        System.out.println("p1.equals(p1) -> " + p1.equals(p1)); // true
    }
}
