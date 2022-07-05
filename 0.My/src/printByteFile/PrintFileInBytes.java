package printByteFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class PrintFileInBytes {
    public static void main(String[] args) throws Exception
    {
        //Создаем поток-чтения-байт-из-файла
        FileInputStream inputStream = new FileInputStream("d:\\audio.log");
        // Создаем поток-записи-байт-в-файл
        FileOutputStream outputStream = new FileOutputStream("d:\\123.log");

        while (inputStream.available() > 0) //пока есть еще непрочитанные байты
        {
           // прочитать очередной байт в переменную data
            outputStream.write(inputStream.read()); // и записать его во второй поток
        }

        inputStream.close(); //закрываем оба потока. Они больше не нужны.
        outputStream.close();
    }
}
