package java_homework.exceptions_and_errors;

public class MyException {

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (MyFirstException e) {
            System.out.println(e.getMessage());
        }
    }

    static void checkAge(int age) throws MyFirstException {
        if (age < 18) {
            throw new MyFirstException("Age must be 18 or older");
        }
    }
}

// собственное исключение
class MyFirstException extends Exception {

    public MyFirstException() {
        super();
    }

    public MyFirstException(String message) {
        super(message);
    }

    public MyFirstException(String message, Throwable cause) {
        super(message, cause);
    }
}

