package java_homework.data_types_and_operators;

public class SwitchOperator {
    static public void main(String args[]) {
        // Практика 1 - типы переменной switch
        // int
        int value = 2;
        int result = 0;
        switch (value) {
            case 1:
                result = 10;
                break;
            case 2:
                result = 20;
                break;
            default:
                result = 30;
                break;
        }
        System.out.println("int: " + result);

        // char
        char c = 'B';
        switch (c) {
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            default:
                System.out.println("Other");
                break;
        }

        // String
        String s = "hello";
        switch (s) {
            case "hi":
                System.out.println("hi");
                break;
            case "hello":
                System.out.println("hello");
                break;
            default:
                System.out.println("other");
                break;
        }

        // enum
        enum Color {
            RED, GREEN, BLUE
        }
        Color color = Color.GREEN;
        switch (color) {
            case RED:
                System.out.println("Red");
                break;
            case GREEN:
                System.out.println("Green");
                break;
            case BLUE:
                System.out.println("Blue");
                break;
        }

        // Практика 2 - switch без break

        int val = 2;
        int i = 0;
        switch (val) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
            case 3:
                i = 3;
                break;
        }
        System.out.println("i = " + i);
        // из-за отсутствия break происходит переход на следующий кейс и т д до первого break
    }
}
