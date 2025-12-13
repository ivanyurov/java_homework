package java_homework.exceptions_and_errors;

public class MultipleCatch {

    public static void main(String[] args) {

        // Практика 1

        // одинаковая обработка исключений
        try {
            makeCommonError(1);
        } catch (ArithmeticException | NullPointerException | IllegalArgumentException e) {
            System.out.println("Handled same way: " + e.getClass().getSimpleName());
        }

        try {
            makeCommonError(2);
        } catch (ArithmeticException | NullPointerException | IllegalArgumentException e) {
            System.out.println("Handled same way: " + e.getClass().getSimpleName());
        }

        try {
            makeCommonError(3);
        } catch (ArithmeticException | NullPointerException | IllegalArgumentException e) {
            System.out.println("Handled same way: " + e.getClass().getSimpleName());
        }

        System.out.println();

        // иерархия исключений Ex1 <|-- Ex2 <|-- Ex3

        try {
            makeHierarchyError(3);
        } catch (Ex3 e) {
            System.out.println("Caught Ex3");
        } catch (Ex2 e) {
            System.out.println("Caught Ex2");
        } catch (Ex1 e) {
            System.out.println("Caught Ex1");
        }

        try {
            makeHierarchyError(2);
        } catch (Ex3 e) {
            System.out.println("Caught Ex3");
        } catch (Ex2 e) {
            System.out.println("Caught Ex2");
        } catch (Ex1 e) {
            System.out.println("Caught Ex1");
        }

        try {
            makeHierarchyError(1);
        } catch (Ex3 e) {
            System.out.println("Caught Ex3");
        } catch (Ex2 e) {
            System.out.println("Caught Ex2");
        } catch (Ex1 e) {
            System.out.println("Caught Ex1");
        }

        // Практика 2
        // final в catch
        try {
            throw new RuntimeException("error");
        } catch (final Exception e) {
            System.out.println("\nFinal catch: " + e.getMessage());
            // e = new Exception(); // ошибка компиляции
            // т. е. ссылку e нельзя переназначить внутри блока catch
        }
    }

    // для multi-catch
    static void makeCommonError(int mode) {
        if (mode == 1) {
            int x = 10 / 0; // ArithmeticException
        }
        if (mode == 2) {
            String s = null;
            s.length(); // NullPointerException
        }
        if (mode == 3) {
            throw new IllegalArgumentException(); // IllegalArgumentException
        }
    }

    // для иерархии
    static void makeHierarchyError(int level) {
        if (level == 1) {
            throw new Ex1();
        }
        if (level == 2) {
            throw new Ex2();
        }
        if (level == 3) {
            throw new Ex3();
        }
    }
}

// иерархия исключений
class Ex1 extends RuntimeException {
}

class Ex2 extends Ex1 {
}

class Ex3 extends Ex2 {
}
