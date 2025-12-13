package java_homework.exceptions_and_errors;

/*
Exception in thread "main" java.lang.ExceptionInInitializerError
Caused by: java.lang.NumberFormatException: For input string: "Y-"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:565)
        at java.base/java.lang.Integer.parseInt(Integer.java:662)
        at java_homework.exceptions_and_errors.StaticError.<clinit>(StaticError.java:6)
*/
public class StaticError {
    final static int START_COUNTER;
    static {
        START_COUNTER = Integer.parseInt("Y-"); // выполняется в момент загрузки класса, поэтому выбросится
                                                // NumberFormatException и main не выполнится
    }

    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
