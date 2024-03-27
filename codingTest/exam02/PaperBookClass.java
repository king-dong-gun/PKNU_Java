package codingTest.exam02;

public class PaperBookClass extends BookClass {
    private int size;

    public int getSize() {
        return size;
    }

    public PaperBookClass(String title, String author, int price, String publish, int size) {
        super(title, author, price, publish);

        this.size = size;
    }
    public void sizeInfo() {
        System.out.println("제목: " + super.getTitle());
        System.out.println("글쓴이 : " + super.getAuthor());
        System.out.println("가격: " + super.getPrice());
        System.out.println("출판사: " + super.getPublish());
        System.out.println("총 페이지 수: " + size + "페이지");
    }
}
