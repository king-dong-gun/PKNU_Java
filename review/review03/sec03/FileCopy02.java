package review.review03.sec03;

import java.io.*;

public class FileCopy02 {

    static InputStream is =null;
    static OutputStream os =null;

    public static void main(String[] args) throws IOException {
        String originalFile = "/Users/kimdonggun/Desktop/Mount.jpeg";
        String copyFile = "/Users/kimdonggun/Desktop/study/source/image/Mount77.jpeg";

        is = new FileInputStream(originalFile);
        os = new FileOutputStream(copyFile);

        byte[] data = new byte[1024];
        while(true) {
            int num = is.read(data);
            if(num == -1) break;
            os.write(data, 0, num);
        }
        os.flush();
        os.close();
        is.close();

        System.out.println("복사완료!!");
    }
}
