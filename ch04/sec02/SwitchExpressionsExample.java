package ch04.sec02;

public class SwitchExpressionsExample {
    public static void main(String[] args) {
        char grade = 'B';

        // Java 12부터 제공
        switch (grade) {
            case 'A', 'a' -> {
                System.out.println("우수 회원입니다.");
            }
            case 'B', 'b' -> {
                System.out.println("일반 회원입니다.");
            }
            default -> {
                System.out.println("손님입니다.");
            }
        }

        // Java 13 부터 제공(실행문이 1개면 중괄호생략 가능)
        switch (grade) {
            case 'A', 'a' -> System.out.println("우수 회원입니다.");
            case 'B', 'b' -> System.out.println("일반 회원입니다.");
            default -> System.out.println("손님입니다.");
        }
    }
}
