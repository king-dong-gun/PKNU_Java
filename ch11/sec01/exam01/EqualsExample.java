package ch11.sec01.exam01;

public class EqualsExample {
    public static void main(String[] args) {
        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");

        if(obj1.equals(obj2)){
            System.out.println("obj1 과 obj2는 동등");
        }else{
            System.out.println("obj1 과 obj2는 동등하지 않다.");
        }

        if (obj1.equals(obj3)) {
            System.out.println("obj1 과 obj3는 동등");
        }else {
            System.out.println("obj1 과 obj3는 동등하지 않습니다.");
        }
    }
}
