package codingTest.exam02;

public class EBookClass extends BookClass {
    private String superDevice;

    public String getSuperDevice() {
        return superDevice;
    }

    public EBookClass(String title, String author, int price, String publish, String superDevice) {
        super(title, author, price, publish);
        this.superDevice = superDevice;
    }

    public void deviceInfo() {
        System.out.println("제목: " + super.getTitle());
        System.out.println("글쓴이 : " + super.getAuthor());
        System.out.println("가격: " + super.getPrice());
        System.out.println("출판사: " + super.getPublish());
        System.out.println("호환기기: " + superDevice);

    }
}
