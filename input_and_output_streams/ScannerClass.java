package java_homework.input_and_output_streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("./java_homework/input_and_output_streams/data.txt");

        Scanner scanner = new Scanner(file, "UTF-8");
        
        // Печатает полное содержимое текстового файла
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();
    }
}
