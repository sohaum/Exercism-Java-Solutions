class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int distanceDriven = 0;
    private int battery = 100;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    // Task 4: Check if the battery is fully drained (less than the cost of one drive)
    public boolean batteryDrained() {
        return this.battery < this.batteryDrain;
    }

    // Task 3: Return total meters covered
    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (!batteryDrained()) {
            distanceDriven += speed;
            battery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
    
    // Getters for RaceTrack calculation
    public int getBatteryDrain() { return batteryDrain; }
    public int getSpeed() { return speed; }
}

class RaceTrack {
    private int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        // Calculation: Total meters / meters per drive = total drives
        // Total drives * cost per drive = total battery needed
        int totalDrivesNeeded = (int) Math.ceil((double) distance / car.getSpeed());
        int totalBatteryCost = totalDrivesNeeded * car.getBatteryDrain();
        
        return totalBatteryCost <= 100;
    }
}