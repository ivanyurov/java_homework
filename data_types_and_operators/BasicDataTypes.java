package java_homework.data_types_and_operators;

public class BasicDataTypes {

    // Практика 1 — базовые типы как поля класса (0-значения по умолчанию)
    static byte byteValue;
    static short shortValue;
    static int intValue;
    static long longValue;
    static float floatValue;
    static double doubleValue;
    static char charValue; // '\u0000'
    static boolean boolValue; // false

    public static void main(String[] args) {

        // Практика 1 — вывод значений
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char (пустой): '" + charValue + "'");
        System.out.println("boolean: " + boolValue);

        // Практика 2 — имя в Unicode
        System.out.println("\n\u0418\u0432\u0430\u043D\n");

        // Практика 3
        // int a = 1;
        // {
        // int b = 2;
        // }
        // int c = a + b;
        // b объявляется внутри блока и недоступна вне его
        System.out.println("Переменная b недоступна за пределами блока {}");

        // Практика 4 — конкатенация String с разными типами
        String name = "Иван";
        int age = 22;
        double height = 1.79;
        System.out.println("Имя: " + name + ", возраст: " + age + ", рост: " + height);

        // Практика 5 — арифметика с разными типами
        int i = 10;
        double d = 2.5;
        double res = i + d; // int расширяется до double
        System.out.println("10 + 2.5 = " + res);

        byte b1 = 5;
        short s1 = 10;
        int res2 = b1 + s1; // byte и short → int
        System.out.println("5 + 10 = " + res2);

        // Практика 6 — сужающее преобразование
        int bigInt = 300;
        byte smallByte = (byte) bigInt; // переполнение
        System.out.println("300 -> byte = " + smallByte);

        double dbl = 12.9;
        int intFromDouble = (int) dbl; // дробная часть отбрасывается
        System.out.println("12.9 -> int = " + intFromDouble);

        // Практика 7
        int a = 120;
        // byte b = a + 10; // ошибка — выражение имеет тип int
        byte c = (byte) (a + 10);
        byte d2 = (byte) (a + 1);

        System.out.println("c = " + c);
        System.out.println("d = " + d2);

        // Практика 8 — var: вывод типа на этапе компиляции
        var number = 10; // int
        var text = "Hello"; // String

        System.out.println(number);
        System.out.println(text);
    }
}
