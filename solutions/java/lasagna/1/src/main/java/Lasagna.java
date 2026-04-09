public class Lasagna {
    private static final int EXPECTED_MINUTES_IN_OVEN = 40;
    private static final int PREPARATION_MINUTES_PER_LAYER = 2;
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return EXPECTED_MINUTES_IN_OVEN;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int m) {
        return expectedMinutesInOven()-m;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int l) {
        return l*PREPARATION_MINUTES_PER_LAYER;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int a, int b) {
        return preparationTimeInMinutes(a)+b;
    }
}
