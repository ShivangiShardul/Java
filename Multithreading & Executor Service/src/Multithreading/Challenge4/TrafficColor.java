package Multithreading.Challenge4;

public enum TrafficColor {
    RED(9000),
    YELLOW(1000),
    GREEN(3000);

    private final int onTimeInMillis;

    public int getOnTimeInMillis() {
        return onTimeInMillis;
    }

    TrafficColor(int onTimeInMillis) {
        this.onTimeInMillis = onTimeInMillis;
    }
}
