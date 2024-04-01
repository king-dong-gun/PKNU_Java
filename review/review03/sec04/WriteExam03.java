package review.review03.sec04;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExam03 {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("GloryManU.txt");

        // 1 문자열 출력
        char m = 'M';
        writer.write(m);

        char a ='a';
        writer.write(a);

        char n ='n';
        writer.write(n);

        char u ='U';
        writer.write(u);

        // char 배열 출력
        char[] array = {'G', 'l', 'o', 'r', 'y'};
        writer.write(array);

        // 문자열 출력
        writer.write("Red");

        // 버퍼에 잔류하고 있는 문자들을 출력하고, 버퍼를 비움
        writer.flush();

        // 출력 스트림을 닫고 메모리 해제
        writer.close();
    }
}
