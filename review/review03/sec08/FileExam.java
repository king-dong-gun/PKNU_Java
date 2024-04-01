package review.review03.sec08;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExam {
    public static void main(String[] args) throws Exception {
        // File 객체 생성
        File dir = new File("./Desktop/study/source");
        File file1 = new File("./Desktop/study/source/file1.txt");
        File file2 = new File("./Desktop/study/source/file2.txt");
        File file3 = new File("./Desktop/study/source/file3.txt");

        // 존재하지 않으면 디렉토리 또는 파일 생성
        if (dir.exists()) {
            dir.mkdirs();
        }
        if (file1.exists()) {
            file1.createNewFile();
        }
        if (file2.exists()) {
            file2.createNewFile();
        }
        if (file3.exists()) {
            file3.createNewFile();
        }

        // study/source 폴더 내용을 출력
        File source = new File("/Users/kimdonggun/Desktop/study/source");
        File[] contents = source.listFiles();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");

        // 각 파일 및 디렉토리 정보 출력
        for (File file : contents) {
            // 파일의 마지막 수정 날짜 및 시간 출력
            System.out.printf("%-25s", sdf.format(new Date(file.lastModified())));
            // 디렉토리인지 파일인지에 따라 다른 출력 수행
            if (file.isDirectory()) {
                System.out.printf("%-10s%-20s", "<DIR>", file.getName());
            } else {
                System.out.printf("%-10s%-20s", file.length(), file.getName());
            }
            System.out.println(); // 줄 바꿈
        }
    }
}
