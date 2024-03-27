package codingTest.exam01;

public class ExecClass {
    public static void main(String[] args) {

        /*회원 등록*/
        CustomClass c1 = new CustomClass(001, "홍길동", 45, 10);
        // c1.name = "김동건";
        //CustomClass c2 = new CustomClass(002, "김영희", 25);
        CustomClass c3 = new CustomClass(003, "김동건", 28, 10);

        //c1.customInfo();
        //c2.customInfo();
        c3.customInfo();
        System.out.println();

        /*상품 등록* 새우깡(100 - 1000), 콜라(500 - 2000),
        천하장사(1000 - 800), 빼빼로(300 - 1500), 사이다(500 - 2000)
         */
        ProductClass p1 = new ProductClass(001, "새우깡", 1000, 100);
        //ProductClass p2 = new ProductClass(002, "콜라", 2000, 500);
        ProductClass p3 = new ProductClass(003, "천하장사", 800, 1000);
        //ProductClass p4 = new ProductClass(004, "빼빼로", 1500, 300);
        //ProductClass p5 = new ProductClass(005, "사이다", 2000, 500);
        p1.productInfo();
        System.out.println();
        c3.addToCart(p1, 30);
        c3.purchase();
        System.out.println();
        c1.addToCart(p3, 890);
        c1.purchase();

  /* 3. 상품구매 - 장바구니에 담기
     4. 상품구매 - 결제 */


        //c3.addToCart(p1, 50);                     //물건, 수량을 담습니다.
        //c1.addToCart(p3, 30);                     //물건, 수량을 담습니다.
        //c3.purchase();                                  //김동건이 새우깡을 구매합니다.
        //c1.purchase();                                  //김동건이 새우깡을 구매합니다.
    }
    // c3 객체의 shoopingBasket 배열에 있는 값들을 출력
}
