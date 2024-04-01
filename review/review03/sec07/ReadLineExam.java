package review.review03.sec07;

import java.io.*;

public class ReadLineExam {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader("./review/review03/sec07/ReadLineExam.java")
        );

        int lineNum = 1;
        while (true) {
            String str = br.readLine();
            if(str == null) break;
            System.out.println(lineNum + "\t" + str);
            lineNum++;
        }
        br.close();
    }
}
