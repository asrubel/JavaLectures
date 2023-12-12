package khai.dict.com.lecture14;

public class CustomThread extends Thread {
    @Override
    public void run() {
        String msg = String.format("Hello, %s", getName());
        System.out.println(msg);
    }
}
