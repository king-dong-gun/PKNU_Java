package ch14.sec02.exam01;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Java"); // Set 은 중복허용 X
        set.add("Spring");

        int size = set.size();
        System.out.println("총 객체 수 : " + size);
    }
}
