package java_homework.data_types_and_operators;

/**
 * Класс Calculator демонстрирует использование javadoc.
 * Содержит методы для простых арифметических операций.
 */
public class Calculator {

    /**
     * Складывает два числа.
     *
     * @param a первое число
     * @param b второе число
     * @return сумма a и b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Вычитает второе число из первого.
     *
     * @param a уменьшаемое
     * @param b вычитаемое
     * @return разность a и b
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Выводит результат в консоль.
     *
     * @param value число для вывода
     */
    public void print(int value) {
        System.out.println("Результат: " + value);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int r = calc.add(5, 3);
        calc.print(r);
    }
}
