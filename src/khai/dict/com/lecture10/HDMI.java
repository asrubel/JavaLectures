package khai.dict.com.lecture10;

public interface HDMI {
    void display();

    default void showManufacturer() {
        System.out.println("Unknown manufacturer");
        privateMethod();
    }

    private void privateMethod() {
        System.out.println("Private");
    }
}
