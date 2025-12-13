package java_homework.strings;

import java.util.StringJoiner;

public class StringClass {
    public static void main(String[] args) {

        // Практика 1

        String s = "Hello World";

        System.out.println(s.length()); // длина строки
        System.out.println(s.charAt(1)); // символ по индексу
        System.out.println(s.toUpperCase()); // в верхний регистр
        System.out.println(s.toLowerCase()); // в нижний регистр
        System.out.println(s.contains("World")); // проверка на вхождение
        System.out.println(s.startsWith("He")); // начальная подстрока
        System.out.println(s.endsWith("ld")); // конечная подстрока
        System.out.println(s.indexOf("o")); // индекс первого вхождения
        System.out.println(s.replace("World", "Java")); // замена подстроки
        System.out.println(s.substring(6)); // подстрока от индекса

        System.out.println();

        // Практика 2

        // Пример 1: список через запятую
        StringJoiner sj = new StringJoiner(", ");
        sj.add("A");
        sj.add("B");
        sj.add("C");
        System.out.println(sj.toString());

        // Пример 2: с префиксом и суффиксом
        StringJoiner sj2 = new StringJoiner("; ", "[", "]");
        sj2.add("red").add("green").add("blue");
        System.out.println(sj2);

        System.out.println();

        // Практика 3
        // В Java это "текстовый блок" — многострочный литерал.
        // Удобен для длинных строк, JSON, SQL, разметки.
        String block = """
                line1
                line2
                line3
                """;

        System.out.println(block);
    }
}
