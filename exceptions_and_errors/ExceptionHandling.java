package java_homework.exceptions_and_errors;

public class ExceptionHandling {
    public static void main(String[] args) {

        // первое исключение будет перехвачено
        try {
            int x = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught");
        }

        System.out.println("Program continues...");

        // второе исключение НЕ перехватывается
        causeCrash();
        /*
         * Exception in thread "main" java.lang.NullPointerException: Cannot invoke
         * "String.length()" because "s" is null
         * at java_homework.exceptions_and_errors.ExceptionHandling.causeCrash(
         * ExceptionHandling.java:24)
         * at
         * java_homework.exceptions_and_errors.ExceptionHandling.main(ExceptionHandling.
         * java:16)
         */

        // эта строка не выполнится
        System.out.println("End of program");
    }

    static void causeCrash() {
        String s = null;
        s.length(); // NullPointerException, обработчика нет
    }

}
