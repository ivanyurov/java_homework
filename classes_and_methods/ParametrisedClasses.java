package java_homework.classes_and_methods;

import java.util.ArrayList;
import java.util.List;

public class ParametrisedClasses {

    public static void main(String[] args) {

        // Практика 1

        Wrapper<Integer> intWrapper = new Wrapper<>(10);
        Wrapper<String> strWrapper = new Wrapper<>("hello");
        Object notWrapper = "text";

        if (intWrapper instanceof Wrapper) {
            System.out.println("intWrapper is Wrapper");
        }

        if (strWrapper instanceof Wrapper) {
            System.out.println("strWrapper is Wrapper");
        }

        if (notWrapper instanceof Wrapper) {
            System.out.println("notWrapper is Wrapper");
        } else {
            System.out.println("notWrapper is NOT Wrapper");
        }

        // Практика 2

        List<Integer> ints = new ArrayList<>();
        List<Number> nums = new ArrayList<>();

        printNumbers(nums);
        // printNumbers(ints); // ошибка The method printNumbers(List<Number>) in the
        // type ParametrisedClasses is not applicable for the arguments (List<Integer>)
        printNumbersOk(ints); // работает с наследником
        printNumbersOk(nums);

        // addInteger(nums); // ошибка The method addInteger(List<Integer>) in the type
        // ParametrisedClasses is not applicable for the arguments (List<Number>)
        addIntegerOk(nums); // работает с предком
    }

    // принимает только List<Number>
    static void printNumbers(List<Number> list) {
        for (Number n : list) {
            System.out.println(n);
        }
    }

    // принимает Number и его подклассы
    static void printNumbersOk(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n);
        }
    }

    // принимает только List<Integer>
    static void addInteger(List<Integer> list) {
        list.add(10);
    }

    // принимает Integer и его родителей
    static void addIntegerOk(List<? super Integer> list) {
        list.add(10);
    }
}

class Wrapper<T> {
    private T item;

    Wrapper(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }
}
