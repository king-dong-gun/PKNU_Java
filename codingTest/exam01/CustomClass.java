package codingTest.exam01;

public class CustomClass {
    String name;                     //회원이름
    int id;                          //회원번호
    int age;                         //회원나이
    int total;

    ProductClass[] shoopingBasket;
    int basket = 0;

    CustomClass(int id, String name, int age, int range) {
        this.id = id;
        this.name = name;
        this.age = age;
        shoopingBasket = new ProductClass[range];
    }


    void addToCart(ProductClass product, int quantity) {
        total = product.price * quantity;
        //void addToCart(ProductClass product, int pruchaseQty) {
        //boolean isOk = product.checkQty(purchaseQty);
        //if (!isOk) {
        //System.out.println("수량이 부족합니다 구입 가능 수량은 %d 입니다." , product.quantity);

        //} else {
        //shoopingBasket[this.purchaseIdx] = product;
        //this.purchaseIdx++;
        //product.quantity -= purchaseQty;      재고수량 = 재고수량 - 구입수량
        //}
        if (product.quantity < quantity) {
        } else {
            shoopingBasket[basket] = new ProductClass(product.id, product.name, product.price, quantity);
            basket += 1;
            product.quantity -= quantity;
            System.out.println("나이가 " + this.age + "세인 " + this.name + "이(가) " + product.price + "원짜리 " +
                    product.name + "을(를) " + quantity + "개를 장바구니에 담았습니다." );
            System.out.println(product.name + "을(를) " + quantity + "개를 담습니다.");
            System.out.println(product.name + "이(가) " + product.quantity + "개가 남았습니다.");
        }
        // product = 새우깡 100 1000원
        // 새우깡 90 1000원

    }


    public void customInfo() {

        String msg = "회원 번호: " + this.id + ", 회원 이름: " +
                this.name + ", 회원 나이: " + this.age + "세";
        System.out.println(msg);
    }

    public void purchase() {
        for (int i = 0; i < shoopingBasket.length; i++) {
            if (shoopingBasket[i] == null) {
                break;
            }
            System.out.println(this.name + " 고객님이 " + shoopingBasket[i].name + "을 "
                    + shoopingBasket[i].quantity + "개 총 " + total +"원 구매하셨습니다.");
        }
    }
}
