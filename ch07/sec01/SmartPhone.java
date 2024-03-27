package ch07.sec01;

public class SmartPhone extends Phone {
    public boolean wifi;


    SmartPhone (){
        System.out.println("나는 스마트폰 생성자입니다.");
    }

    public SmartPhone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경했습니다.");
    }

    public void internet() {
        System.out.println("인터넷에 연결합니다.");
    }
}
