package java_homework.exceptions_and_errors;

public class FinallyBlock {

    public static void main(String[] args) {

        // Практика 1
        // try без catch и finally - нельзя
        //
        // try {
        // System.out.println("test");
        // }                            тут: Syntax error, insert "Finally" to complete BlockStatements
        //

        // Практика 2
        // try только с finally - можно
        try {
            System.out.println("try block");
        } finally {
            System.out.println("finally block");
        }

        // Практика 3
        // два finally - нельзя

        // try {
        // System.out.println("test");
        // } finally {
        // System.out.println("first finally");
        // } finally {                          тут: Syntax error on token "finally", delete this token
        // System.out.println("second finally");
        // }

    }
}