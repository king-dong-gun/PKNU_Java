package ch05.sec03;

public class LengthExample {
    public static void main(String[] args) {
        String ssn = "9703271111111";
        int len = ssn.length();
        if (len == 13) {
            System.out.println("주민등록번호 자릿수가 맞습니다.");
        } else {
            System.out.println("주민등록번호 자릿수가 틀립니다.");
        }
    }
}
