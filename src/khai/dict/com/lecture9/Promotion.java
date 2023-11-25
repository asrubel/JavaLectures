package khai.dict.com.lecture9;

public class Promotion {
    Salary salary;

    public Promotion(Salary salary) {
        this.salary = salary;
    }

    public void promote() {
        salary.income += 1000;
    }
}
