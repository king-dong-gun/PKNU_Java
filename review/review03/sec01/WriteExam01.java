package review.review03.sec01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExam01 {
    static  OutputStream os = null;
    public static void main(String[] args) throws FileNotFoundException {
        try {
            os = new FileOutputStream("./test01.db");
            /*
            byte byteA = 10;
            byte byteB = 20;
            byte byteC = 30;

            os.write(byteA);
            os.write(byteB);
            os.write(byteC);

            os.flush();
            os.close();
            */
            byte[] array = {10, 20, 30};

            os.write(array);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
