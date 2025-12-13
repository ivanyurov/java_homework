package java_homework.strings;

public class BuilderBuffer {
    public static void main(String[] args) {

        // Практика 1

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // добавить в конец
        sb.insert(5, "_"); // вставить
        sb.delete(5, 6); // удалить диапазон
        sb.replace(0, 5, "Hi"); // заменить диапазон
        sb.reverse(); // развернуть строку
        sb.setCharAt(0, 'X'); // заменить символ
        sb.ensureCapacity(50); // гарантировать размер буфера
        sb.trimToSize(); // уменьшить буфер до фактической длины
        System.out.println(sb.length()); // длина
        System.out.println(sb.toString()); // получить строку

        System.out.println();

        // Методы StringBuffer (те-же, но потокобезопасные)

        StringBuffer sbf = new StringBuffer("One");
        sbf.append(" Two"); // добавить
        sbf.insert(3, "!"); // вставить
        sbf.deleteCharAt(3); // удалить один символ
        sbf.replace(0, 3, "Num"); // заменить
        sbf.reverse(); // развернуть
        System.out.println(sbf.capacity()); // текущая емкость буфера
        System.out.println(sbf.length()); // длина
        sbf.setLength(5); // изменить длину (обрезать или заполнить)
        System.out.println(sbf.toString()); // получить строку

        System.out.println();

        // Практика 2

        // String -> StringBuilder / StringBuffer
        String str = "ABC";
        StringBuilder sb2 = new StringBuilder(str);
        StringBuffer sbf2 = new StringBuffer(str);

        // StringBuilder -> String / StringBuffer
        String s_from_sb = sb2.toString();
        StringBuffer sbf_from_sb = new StringBuffer(sb2);

        // StringBuffer -> String / StringBuilder
        String s_from_sbf = sbf2.toString();
        StringBuilder sb_from_sbf = new StringBuilder(sbf2);

        // Проверка вывода
        System.out.println(s_from_sb);
        System.out.println(sbf_from_sb);
        System.out.println(s_from_sbf);
        System.out.println(sb_from_sbf);
    }
}
