package ch13.sec03.exam02;

public class YieldExample {
    public static void main(String[] args) {
        WorkThread workThreadA = new WorkThread("ronaldo");
        WorkThread workThreadB = new WorkThread("messi");

        workThreadA.start();
        workThreadB.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        workThreadA.work = false;

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        workThreadA.work = true;
    }
}
