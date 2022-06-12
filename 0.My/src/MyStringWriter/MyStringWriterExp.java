package MyStringWriter;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public class MyStringWriterExp {
    public static void main(String[] args) throws IOException {
        StringWriter writer=new StringWriter();
        writer.write("Hello");
        writer.write("123");
        System.out.println(writer.toString());
        writer.write("123");
        System.out.println(writer.toString());
        writer.close();
        System.out.println(writer.toString());
    }
}
