package review.review03.sec04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExm03 {
    public static void main(String[] args) throws IOException {
        Reader reader = null;

        // 1 문자씩 읽기
        reader = new FileReader("./GloryManU.txt");

        while (true) {
            int data = reader.read();
            if (data == -1) break;
            System.out.print((char) data);
        }
        System.out.println();

        // 문자 배열로 읽기
        reader = new FileReader("./GloryManU.txt");
        char[] data = new char[150];

        while (true) {
            int num = reader.read(data);
            if (num == -1) break;
            // for문을 사용한 데이터 읽기
//            for (int i = 0; i < data.length; i++) {
//                if (data[i] == ' ') break;
//
//                System.out.print(data[i]);
//            }
            // for each문을 사용한 데이터 읽기
            for (char datum : data) {
                System.out.print(datum);
            }
        }
        reader.close();
    }
}
