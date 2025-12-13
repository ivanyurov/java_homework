package java_homework.exceptions_and_errors;

/*
Throwable
Базовый класс для всех ошибок и исключений. Его потомков можно throw и catch.

Error (наследуется от Throwable)
Критические ошибки JVM (OutOfMemoryError и т.п.).
Обычно не обрабатываются, программа не может корректно продолжить работу.

Exception (наследуется от Throwable)
Ошибки, которые можно и нужно обрабатывать.
Делятся на:

Проверяемые: наследуются от Exception, но не от RuntimeException (например, IOException).
Требуют обработки try-catch или throws.

Непроверяемые: Наследуются от RuntimeException (например, NullPointerException,
ArrayIndexOutOfBoundsException, ArithmeticException). Компилятор не требует их обработки.
*/

public class ExceptionsHierarchy {
    public static void main(String[] args) {

        // ArithmeticException
        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught");
        }

        // ArrayIndexOutOfBoundsException
        try {
            int[] arr = { 1, 2, 3 };
            int x = arr[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        }

        // IllegalArgumentException
        try {
            setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        }

        // ClassCastException
        try {
            Object s = "text";
            Integer i = (Integer) s;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException caught");
        }

        // NullPointerException
        try {
            String s = null;
            s.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
        }
    }

    static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("age < 0");
        }
    }

}
