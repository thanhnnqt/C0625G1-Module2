package ss4_oop.bai_tap;

public class StopWatch {
    private int startTime, endTime;

    public StopWatch(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public int start() {
        return getStartTime();
    }

    public int stop() {
        return getEndTime();
    }

    public int getElapsedTime() {
        return getEndTime() - getStartTime();
    }
}
