package java_homework.input_and_output_streams;

import java.io.*;

public class IOStreams {

    public static void main(String[] args) throws IOException {

        // Практика 1
        byte[] data = { 65, 66, 67 }; // A B C
        InputStream in = new ByteArrayInputStream(data);

        int b;
        while ((b = in.read()) != -1) {
            System.out.println("Read byte: " + b);
        }
        in.close();

        System.out.println();

        // Практика 2
        OutputStream out = new ByteArrayOutputStream();
        out.write(72); // H
        out.write(73); // I
        out.close();

        System.out.println("Written bytes: " + out.toString());

        System.out.println();

        // Практика 3
        // Reader и Writer позволяют работать с кодировками, что существенно упрощает
        // обработку текста.
        byte[] data1 = "Привет".getBytes("UTF-8");

        Reader reader = new InputStreamReader(
                new ByteArrayInputStream(data1),
                "UTF-8");

        int ch;
        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }
        // Корректный вывод так как учитывается кодировка

        System.out.println();

        byte[] data3 = "Привет".getBytes("UTF-8");

        InputStream in1 = new ByteArrayInputStream(data3);

        int с;
        while ((с = in1.read()) != -1) {
            System.out.print((char) с);
        }
        // InputStream.read() читает один байт UTF-8 кодирует кириллицу двумя байтами
        // (char) b преобразует один байт в символ в итоге каждый байт печатается как
        // отдельный символ (????????????)

        in.close();
        reader.close();

        System.out.println();

        // Практика 4
        try (InputStream auto = new ByteArrayInputStream(new byte[] { 88, 89 })) {
            System.out.println("\nAutoCloseable read: " + auto.read());
        }
        // AutoCloseable позволяет использовать try-with-resources, ресурс закрывается
        // автоматически, не нужен finally
    }
}
