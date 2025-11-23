package java_homework.data_types_and_operators;

public class Operators {

    public static void main(String[] args) {

        // Практика 1

        int a = 10;
        int b = 3;
        String s1 = "Hello";
        String s2 = "World";

        // = (присваивание)
        int x = a;

        // += (для чисел)
        x += 5;     // x = 15

        // += (для String – конкатенация)
        s1 += " Java"; // "Hello Java"

        // ?: тернарный оператор
        int max = (a > b) ? a : b;

        System.out.println("Максимум = " + max);

        // ||
        boolean orResult = (a > 5) || (b < 0);

        // &&
        boolean andResult = (a > 5) && (b < 0);

        // |
        int bitOr = a | b; // побитовое ИЛИ

        // ^
        int bitXor = a ^ b; // XOR

        // &
        int bitAnd = a & b; // побитовое AND

        // ==
        boolean eq = (a == b);
        boolean strEq = s1.equals(s2); // корректное сравнение строк

        // >
        boolean greater = a > b;
        boolean lessEqual = a <= b;

        // сдвиги
        int sh1 = a >> 1;
        int sh2 = a << 2;

        // + и - (числа)
        int sum = a + b;
        int diff = a - b;

        // + (конкатенация)
        String combined = s1 + " " + s2;

        // * / %
        int mul = a * b;
        int div = a / b;
        int mod = a % b;

        // ++ / -- (префикс и постфикс)
        int p1 = 5;
        int res1 = ++p1;  // p1 = 6, res1 = 6 (префикс)

        int p2 = 5;
        int res2 = p2++;  // p2 = 6, res2 = 5 (постфикс)

        int m1 = 5;
        int res3 = --m1;  // m1 = 4, res3 = 4

        int m2 = 5;
        int res4 = m2--;  // m2 = 4, res4 = 5

        // ! (логическое отрицание)
        boolean notRes = !true;

        // () используется для группировки
        int expr = (a + b) * 2;

        // [] покажем на массиве
        int[] arr = {1, 2, 3};
        int arrVal = arr[1];


        // Практика 2
        System.out.println("\nПроверка instanceof:");

        Object obj = "Строка";
        System.out.println(obj instanceof String); // true

        obj = 123;
        System.out.println(obj instanceof Integer); // true

        // null проверяется отдельно — результат всегда false
        obj = null;
        System.out.println(obj instanceof String); // false
    }
}
