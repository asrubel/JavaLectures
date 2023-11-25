package khai.dict.com.lecture9;

public class SmartPhone extends Mobile {
    private Laptop laptop;

    public SmartPhone(Laptop laptop) {
        this.laptop = laptop;
    }

    void sendDataToLaptop(String data) {
        notify(data);
        laptop.receiveInfo(data);
    }
}
