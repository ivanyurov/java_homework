package java_homework.strings;

import java.util.Date;
import java.util.Formatter;

public class MyFormatter {
    public static void main(String[] args) {

        // Практика 1

        Formatter f = new Formatter();
        f.format("bool=%b, char=%c, int=%d, float=%.2f, str=%s%n",
                true, 'A', 123, 3.1415, "text");
        System.out.print(f.toString());
        f.close();

        // Практика 2
        // flush() сбрасывает буфер форматтера в поток (например FileOutputStream).

        // Практика 3

        Date now = new Date();
        Formatter f2 = new Formatter();

        f2.format("Hour24=%tH, Hour12=%tI, Minutes=%tM, Month=%tB, Year=%tY%n",
                now, now, now, now, now);

        System.out.print(f2.toString());
        f2.close();
    }
}
