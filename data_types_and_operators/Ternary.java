package java_homework.data_types_and_operators;

public class Ternary {
    public static void main(String[] args) {

        int a = 2;

        // Вариант 1 - обычный if-else
        int i1;
        if (a == 1) {
            i1 = 1;
        } else if (a == 2) {
            i1 = 2;
        } else {
            i1 = 3;
        }
        System.out.println("Результат через if-else: " + i1);

        // Вариант 2 - тернарный оператор
        int i2 = (a == 1) ? 1 : (a == 2) ? 2 : 3;
        System.out.println("Результат через тернарный оператор: " + i2);
    }
}
