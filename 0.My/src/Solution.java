import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String filename = bufferedReader.readLine();
        FileInputStream inputStream = new FileInputStream(filename);

        ArrayList<Integer> integers = new ArrayList<Integer>();
        ArrayList<Integer> finalintegers = new ArrayList<Integer>();

        while (inputStream.available() > 0) {
            integers.add(inputStream.read());
        }
        inputStream.close();

        int minByte = Integer.MAX_VALUE;
        for (int tmp : integers) {
            if (0 < tmp && tmp < minByte) minByte = tmp;
        }

        for (int i = 0; i < integers.size(); i ++) {
            if (integers.get(i) == minByte) {
                System.out.print(i + " ");
            }
        }

        bufferedReader.close();
    }
}
