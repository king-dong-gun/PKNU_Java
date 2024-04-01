package review.review03.sec08;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExam {
    public static void main(String[] args) {
        try {
            String data = "" +
                    "id >> Mason Mount7\n" +
                    "email >> ManU2024@premierLeague.com\n" +
                    "tel >> 010-1234-1234";

            // Path 객체 생성
            Path path = Paths.get("/Users/kimdonggun/Desktop/study/source/ManU.txt");

            // 파일 생성 및 데이터 저장
            Files.writeString(Paths.get("/Users/kimdonggun/Desktop/study/source/ManU.txt"), data,
            Charset.forName("UTF-8"));

            // 파일정보 얻기
            System.out.println("파일 유형 >> " + Files.probeContentType(path));
            System.out.println("파일 크기 >> " + Files.size(path) + "bytes");

            // 파일 읽기
            String content = Files.readString(path, Charset.forName("UTF-8"));
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
