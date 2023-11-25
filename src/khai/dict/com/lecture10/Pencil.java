package khai.dict.com.lecture10;

public class Pencil implements DrawingTool {
    @Override
    public void draw(String writing) {
        System.out.println("Thin line with writing " + writing);
    }
}
