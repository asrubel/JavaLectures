package khai.dict.com.lecture14;

public class CustomRunnable implements Runnable {
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        String msg = String.format("Hello, %s", threadName);
        System.out.println(msg);
    }
}
