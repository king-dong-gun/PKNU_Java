package ch06.sec06.exam02.package02;

import ch06.sec06.exam02.package01.A;
public class C {
    public C(){
        A a = new A();

        a.field1 = 1;
//        a.field2 = 1; // default 필드 접근불가(타 패지키 X)
//        a.field3 = 1; // private 필드 접근불가

        a.method1();
//        a.method2(); // default 메서드 접근불가(타 패지키 X)
//        a.method3(); // private 메서드 접근불가
    }
}
