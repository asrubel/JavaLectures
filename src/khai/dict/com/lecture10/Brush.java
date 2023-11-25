package khai.dict.com.lecture10;

public class Brush implements DrawingTool {
    @Override
    public void draw(String writing) {
        System.out.println("Bold line with writing " + writing);
    }
}
