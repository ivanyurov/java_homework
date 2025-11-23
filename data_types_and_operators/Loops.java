package java_homework.data_types_and_operators;

public class Loops {

    public static void main(String[] args) {

        // Практика 1 - бесконечные циклы

        System.out.println("Бесконечный цикл while (с break):");
        int count = 0;
        while (true) { // бесконечный цикл
            System.out.println("count = " + count);
            count++;
            if (count >= 5) {
                break; // выход из цикла
            }
        }

        System.out.println("\nБесконечный цикл do-while (с break):");
        int dcount = 0;
        do {
            System.out.println("dcount = " + dcount);
            dcount++;
            if (dcount >= 5) {
                break; // выход из цикла
            }
        } while (true); // бесконечный цикл

        // Практика 2 - break и continue

        System.out.println("\nЦикл for с continue и break:");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // пропустить чётные числа
            }
            if (i > 7) {
                break; // выйти, если i > 7
            }
            System.out.println("i = " + i); // печатаются только 1, 3, 5, 7
        }
    }
}