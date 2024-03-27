package codingTest.exam02;

import java.util.List;

public class BookClass {
    private String title;
    private String author;
    private int price;
    private String publish;
    private float tax = 1.1f;

    //public void bookInfo() {
    //    System.out.println("책 제목: " + getTitle() + ", 저자: " + getAuthor() + ", 가격: " + getPrice() + ", 출판사: " + getPublish());
    //}

    public BookClass(String title, String author, int price, String publish) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publish = publish;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }
    public String getPublish() {
        return publish;
    }

    public float getTax() {
        return tax;
    }
}

