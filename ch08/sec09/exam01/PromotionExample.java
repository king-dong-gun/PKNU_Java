package ch08.sec09.exam01;

public class PromotionExample {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a; //인터페이스

        a = b;
        a = c;
        a = d;
        a = e;
    }
}
