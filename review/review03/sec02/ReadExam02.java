package review.review03.sec02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExam02 {
    static InputStream is = null;

    public static void main(String[] args) throws FileNotFoundException {
        try {
            is = new FileInputStream("./test02.db");

            byte[] data = new byte[100];

            while (true) {
                int num = is.read(data);
                if (num == -1) break;

                for (int i = 0; i < num; i++) {
                    System.out.println(data[i]);

                }
            }
            is.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
