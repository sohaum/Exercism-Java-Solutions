import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        // Use nextInt with the array length to get a valid random index
        int index = random.nextInt(PLANET_CLASSES.length);
        return PLANET_CLASSES[index];
    }

    String randomShipRegistryNumber() {
        // nextInt(1000, 10000) returns a number between 1000 (inclusive) and 10000 (exclusive)
        int number = random.nextInt(1000, 10000);
        return "NCC-" + number;
    }

    double randomStardate() {
        // Formula: min + (max - min) * random.nextDouble()
        // Or simplified: 41000.0 + random.nextDouble(1000.0)
        return 41000.0 + (random.nextDouble() * 1000.0);
    }
}