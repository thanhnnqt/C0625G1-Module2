package ss4_oop.bai_tap;

public class StopWatch {
    long startTime;
    long endTime;

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public long getElapsedTime() {
        return getEndTime() - getStartTime();
    }
}
