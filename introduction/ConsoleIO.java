package java_homework.introduction;

import java.util.Scanner;

public class ConsoleIO {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner scan = new Scanner(System.in, "CP866");
        String output = "Привет, " + scan.next();
        System.out.println(output);
        scan.close();
    }

}
