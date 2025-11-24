package java_homework.classes_and_methods;

// Пример перечисления с инициализацией элементов
enum Day {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    private String description;

    // Конструктор enum
    Day(String desc) {
        this.description = desc;
    }

    // Метод для получения описания
    public String getDescription() {
        return description;
    }

    // Пример собственного метода
    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}

public class Enums {
    public static void main(String[] args) {
        Day today = Day.MONDAY;

        System.out.println("Сегодня: " + today);
        System.out.println("Описание: " + today.getDescription());
        System.out.println("Выходной? " + today.isWeekend());

        Day friday = Day.FRIDAY;
        System.out.println("\nСегодня: " + friday);
        System.out.println("Описание: " + friday.getDescription());
        System.out.println("Выходной? " + friday.isWeekend());

        // Цикл по всем элементам enum
        System.out.println("\nВсе дни недели:");
        for (Day d : Day.values()) {
            System.out.println(d + " - " + d.getDescription() + ", выходной? " + d.isWeekend());
        }
    }
}
