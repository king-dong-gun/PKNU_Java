package review.review03.sec01;

import java.io.*;

public class ReadExam01 {

    static InputStream is = null;

    public static void main(String[] args) {

        try {
            is = new FileInputStream("./test01.db");

            while (true) {
                int data = is.read();
                if (data == -1)
                    break;
                System.out.println(data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
