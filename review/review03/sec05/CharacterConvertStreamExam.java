package review.review03.sec05;

import java.io.*;

public class CharacterConvertStreamExam {

    public static void main(String[] args) throws Exception {
        // "맨체스터는 빨강" 문자열을 파일에 쓰는 메서드 호출
        write("맨체스터는 빨강");
        // 파일에서 문자열을 읽어들이는 메서드 호출
        String data = read();
    }

    // 파일에 문자열을 쓰는 메서드
    public static void write(String str) throws Exception {
        // 파일에 출력할 OutputStream 생성
        OutputStream os = new FileOutputStream("/Users/kimdonggun/Desktop/study/source/GloryManU.txt");
        // OutputStream을 Writer로 변환하면서 UTF-8 인코딩 지정
        Writer writer = new OutputStreamWriter(os, "UTF-8");
        // 문자열을 출력 스트림에 씀
        writer.write(str);
        // 버퍼의 데이터를 출력 스트림에 씀
        writer.flush();
        // 출력 스트림과 연관된 리소스를 닫음
        writer.close();
    }

    // 파일에서 문자열을 읽어들이는 메서드
    public static String read() throws Exception {
        // 파일로부터 데이터를 입력받을 InputStream 생성
        InputStream is = new FileInputStream("/Users/kimdonggun/Desktop/study/source/GloryManU.txt");
        // InputStream을 Reader로 변환하면서 UTF-8 인코딩 지정
        Reader reader = new InputStreamReader(is, "UTF-8");
        // 문자 배열을 선언하여 데이터를 읽음
        char[] data = new char[100];
        // 읽은 문자의 개수를 반환
        int num = reader.read(data);
        // Reader와 연관된 리소스를 닫음
        reader.close();
        // 읽은 문자열을 생성하고 반환
        String str = new String(data, 0, num);
        return str;
    }
}
