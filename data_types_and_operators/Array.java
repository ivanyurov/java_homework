package java_homework.data_types_and_operators;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        // Практика 1 - присваивание массивов

        int a1[] = { 1, 2, 3, 4, 5 };
        int a2[] = { 6, 7, 8, 9, 10 };

        System.out.println("До присваивания:");
        System.out.println("a1 = " + Arrays.toString(a1));
        System.out.println("a2 = " + Arrays.toString(a2));

        a1 = a2; // теперь a1 ссылается на тот же массив, что и a2

        System.out.println("После присваивания a1 = a2:");
        System.out.println("a1 = " + Arrays.toString(a1));

        // Изменим элемент через a1 и проверим a2
        a1[0] = 100;
        System.out.println("После изменения a1[0] = 100:");
        System.out.println("a1 = " + Arrays.toString(a1));
        System.out.println("a2 = " + Arrays.toString(a2));
        // Вывод показывает, что a1 и a2 ссылаются на один и тот же массив

        // Практика 2 - методы класса Arrays

        int[] arr = { 5, 2, 8, 3, 9 };

        System.out.println("\nМассив: " + Arrays.toString(arr)); // toString

        // Сортировка
        Arrays.sort(arr);
        System.out.println("После сортировки: " + Arrays.toString(arr));

        // Бинарный поиск (массив должен быть отсортирован)
        int index = Arrays.binarySearch(arr, 8);
        System.out.println("Индекс элемента 8: " + index);

        // Сравнение массивов на равенство
        int[] arr2 = { 2, 3, 5, 8, 9 };
        boolean eq = Arrays.equals(arr, arr2);
        System.out.println("arr.equals(arr2): " + eq);

        // Сравнение массивов с помощью compare (сначала используем Integer[] для compare)
        Integer[] arrObj1 = { 1, 3, 5 };
        Integer[] arrObj2 = { 1, 4, 5 };
        int cmp = Arrays.compare(arrObj1, arrObj2);
        System.out.println("Arrays.compare(arrObj1, arrObj2): " + cmp);
    }

}
