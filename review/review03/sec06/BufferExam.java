package review.review03.sec06;

import java.io.*;

public class BufferExam {
    public static void main(String[] args) throws IOException {
        // 입출력 스트림 생성
        String originalFile =
                BufferExam.class.getResource("ManU.jpeg").getPath();
        String targetFile = "./ManU2.jpeg";
        FileInputStream fis = new FileInputStream(originalFile);
        FileOutputStream fos = new FileOutputStream(targetFile);

        // 입출력 스트림 + 버퍼 스트림 생성
        String originalFile2 =
                BufferExam.class.getResource("Mount7.jpeg").getPath();
        String targetFile2 = "./Mount2.jpeg";
        FileInputStream fis2 = new FileInputStream(originalFile2);
        FileOutputStream fos2 = new FileOutputStream(targetFile2);
        BufferedInputStream bis = new BufferedInputStream(fis2);
        BufferedOutputStream bos = new BufferedOutputStream(fos2);

        // 버퍼를 사용하지 않고 복사
        long nonBufferTime = copy(fis, fos);
        System.out.println("버퍼 미사용 >> \t"  + nonBufferTime + " ns");

        // 버퍼를 사용하고 복사
        long bufferTime = copy(bis, bos);
        System.out.println("버퍼 사용 >> \t"  + bufferTime + " ns");

        fis.close();
        fos.close();
        bis.close();
        bos.close();
    }
    public static long copy(InputStream is, OutputStream os) throws IOException {
        // 시작 시간 설정
        long start = System.nanoTime();
        // 1바이트를 읽고 1바이트를 출력
        while(true) {
            int data = is.read();
            if (data == -1) break;
            os.write(data);
        }
        os.flush();
        // 끝시간 저장
        long end = System.nanoTime();
        // 복사 시간 리턴
        return (end-start);
    }
}

