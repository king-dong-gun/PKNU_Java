package review.review03.sec02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExam02 {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("./test02.db");

            // 바이트 배열의 인덱스는 0부터 시 >> 따라서 배열 {10, 20, 30, 40, 50}에서 인덱스 1은 숫자 20
            byte[] array = {10, 20, 30, 40, 50};
            // os.write(array, 1, 3) 메서드 호출은 배열의 인덱스 1부터 시작하여 3개의 요소를 파일에 쓰도록 지정
            os.write(array, 1, 3);

            os.flush();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
