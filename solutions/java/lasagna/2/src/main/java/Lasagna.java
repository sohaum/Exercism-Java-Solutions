public class Lasagna {
    private static final int EXPECTED_MINUTES_IN_OVEN = 40;
    private static final int PREPARATION_MINUTES_PER_LAYER = 2;
    public int expectedMinutesInOven() {
        return EXPECTED_MINUTES_IN_OVEN;
    }
    public int remainingMinutesInOven(int m) {
        return expectedMinutesInOven()-m;
    }
    public int preparationTimeInMinutes(int l) {
        return l*PREPARATION_MINUTES_PER_LAYER;
    }
    public int totalTimeInMinutes(int a, int b) {
        return preparationTimeInMinutes(a)+b;
    }
}
