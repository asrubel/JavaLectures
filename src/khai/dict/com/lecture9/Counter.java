package khai.dict.com.lecture9;

public class Counter {
    private long current = 0;

    public long getCurrent() {
        return current;
    }

    public void inc() {
        inc(1L);
    }

    private void inc(long value) {
        current += value;
    }
}
