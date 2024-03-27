package ch13.sec05.exam03;

public class InterruptExample {
    public static void main(String[] args) {
        PrintThread thread = new PrintThread();
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread.interrupt();
    }
}
