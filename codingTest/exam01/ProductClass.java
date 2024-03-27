package codingTest.exam01;

public class ProductClass {
    String name;                //물건 이름
    int id;                     //물건 번호
    int price;                  //물건 가격
    public int quantity;               //물건 수량


    ProductClass(int id, String name, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;


    }

    void productInfo() {
        String msg = "물품번호: " + this.id + ", 물품이름: " + this.name +
                ", 물품가격: " + this.price + "원, 물품 수량: " + this.quantity + "개";
        System.out.println(msg);

    }

    /*boolean checkQty(int purchaseQty) {
        System.out.println("id: " + %d + "물품: " + %s + "

     */
}
