package java_homework.data_types_and_operators;

public class WrapperClasses {

    static public void main(String[] args) {

        // Практика 1 - методы decode()

        Integer d1 = Integer.decode("12"); // десятичное
        Integer d2 = Integer.decode("012"); // восьмеричное
        Integer d3 = Integer.decode("0x12"); // шестнадцатеричное
        Integer d4 = Integer.decode("#12"); // шестнадцатеричное

        System.out.println("decode(\"12\")  = " + d1);
        System.out.println("decode(\"012\") = " + d2);
        System.out.println("decode(\"0x12\")= " + d3);
        System.out.println("decode(\"#12\") = " + d4);

        // Практика 2 - все способы создать Boolean

        Boolean bool1 = Boolean.valueOf(true);
        Boolean bool2 = Boolean.valueOf("true");
        Boolean bool3 = Boolean.parseBoolean("false");
        Boolean bool4 = true; // автоупаковка

        System.out.println("\nBoolean examples:");
        System.out.println("valueOf(true)    - " + bool1);
        System.out.println("valueOf(\"true\")  - " + bool2);
        System.out.println("parseBoolean(...)- " + bool3);
        System.out.println("auto boxing      - " + bool4);

        // Практика 3 - когда будет NPE

        System.out.println("\nAutounboxing NPE example:");

        try {
            Integer x = null;
            int y = x; // здесь произойдёт NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NPE пойман: попытка распаковать null");
        }

        // -------------------------------
        // Практика 4 - пример с IntegerCache
        // -------------------------------

        System.out.println("\n128 example:");

        int i1 = 128;
        Integer a1 = i1;
        Integer b1 = i1;

        System.out.println("a1 == i1      - " + (a1 == i1));
        System.out.println("b1 == i1      - " + (b1 == i1));
        System.out.println("a1 == b1      - " + (a1 == b1));
        System.out.println("a1.equals(i1) - " + a1.equals(i1));
        System.out.println("b1.equals(i1) - " + b1.equals(i1));
        System.out.println("a1.equals(b1) - " + a1.equals(b1));

        System.out.println("\n127 example:");

        int i2 = 127;
        Integer a2 = i2;
        Integer b2 = i2;

        System.out.println("a2 == i2      - " + (a2 == i2));
        System.out.println("b2 == i2      - " + (b2 == i2));
        System.out.println("a2 == b2      - " + (a2 == b2));
        System.out.println("a2.equals(i2) - " + a2.equals(i2));
        System.out.println("b2.equals(i2) - " + b2.equals(i2));
        System.out.println("a2.equals(b2) - " + a2.equals(b2));

        System.out.println(
                "\nValues от -128 до 127 кешируются в IntegerCache,\n" +
                        "поэтому для 127 a2 и b2 - один объект, а для 128 - разные.");
    }
}