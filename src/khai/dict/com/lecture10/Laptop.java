package khai.dict.com.lecture10;

public class Laptop implements USB, WiFi, HDMI {
    @Override
    public void display() {
        System.out.println("Laptop made in...");
    }

    @Override
    public void charge() {
        System.out.println("Charging...");
    }

    @Override
    public void transferData(String data) {
        System.out.println("Transferring... " + data);
    }

    @Override
    public void transmitData(String data) {
        System.out.println("Transmitting... " + data);
    }
}
