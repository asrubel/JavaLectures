package khai.dict.com.lecture10;

public class Car implements Comparable<Car> {
    private int number;
    private String model;
    private int weight;
    private String color;

    Car(int number, String model, int weight, String color) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public int compareTo(Car o) {
        if (this.weight == o.weight) {
            return 0;
        } else if (this.weight > o.weight) {
            return 1;
        } else {
            return -1;
        }
    }

    public String toString() {
        return "Model: " + this.model + ", weight: " + this.weight;
    }
}
