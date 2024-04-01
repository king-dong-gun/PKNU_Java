package review.review03.ex.test01;

import java.io.*;
import java.util.Scanner;

public class LogInExam02 {

    public static void main(String[] args) throws IOException {
        // 파일에서 문자열을 읽어들이는 메서드 호출
        read();
    }

    // 파일에서 문자열을 읽어들이는 메서드
    public static void read() throws IOException {
        Scanner sc = new Scanner(System.in);
        File file = new File("review/review03/ex/test01/HomePage.txt");

        // 파일이 존재하는지 확인, 없으면 생성
        boolean isExist = file.exists();
        if (isExist != true) {
            file.createNewFile();
        }

        while (true) {
            System.out.println("1. Log in\n2. Sign up\n3. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // 버퍼 비우기

            switch (choice) {
                // 로그인
                case 1:
                    System.out.println("아이디를 입력하세요.");
                    String loginUserName = sc.nextLine();
                    System.out.println("비밀번호를 입력하세요.");
                    String loginPswd = sc.nextLine();
                    System.out.println("로그인 성공!! 사용자: " + loginUserName);
                    logIn(loginUserName, loginPswd, file);
                    break;
                // 회원가입
                case 2:
                    System.out.println("회원가입을 하시겠습니까?");
                    System.out.println("1. 회원가입\n2. 돌아가기");
                    int signUpChoice = sc.nextInt();
                    sc.nextLine(); // 버퍼 비우기
                    if (signUpChoice == 1) {
                        System.out.println("아이디를 생성하세요.");
                        String signUserName = sc.nextLine();
                        System.out.println("비밀번호를 생성하세요.");
                        String signUserPswd = sc.nextLine();
                        signUp(signUserName, signUserPswd, file);
                        System.out.println("회원가입이 완료되었습니다.");
                    } else if (signUpChoice == 2) {
                        System.out.println("이전 화면으로 돌아갑니다.");
                    } else {
                        System.out.println("잘못된 입력입니다.");
                    }
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("올바른 메뉴를 선택해주세요.");
                    break;
            }
        }
    }

    // 회원가입 정보를 파일에 저장하는 메서드
    public static void signUp(String userName, String pswd, File file) throws IOException {
        FileWriter writer = new FileWriter(file, true); // append >> true를 하면서 이어붙이기
        writer.write("=======회원가입정보======\n");
        writer.write("id >> " + userName + ", pswd >> " + pswd + "\n");
        writer.close();
    }

    // 로그인 정보를 파일에 저장하는 메서드
    public static void logIn(String userName, String pswd, File file) throws IOException {
        FileWriter writer = new FileWriter(file, true); // append >> true를 하면서 이어붙이기
        writer.write("=======로그인정보======\n");
        writer.write("id >> " + userName + ", pswd >> " + pswd + "\n");
        writer.close();
    }
}


