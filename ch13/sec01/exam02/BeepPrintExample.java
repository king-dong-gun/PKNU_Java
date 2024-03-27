package ch13.sec01.exam02;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    toolkit.beep();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("띵띵");
            try {Thread.sleep(500);}
            catch (Exception e){}
        }
    }
}
