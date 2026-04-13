public class JedliksToyCar {
    private int drive=0;
    private int battery=100;
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + drive +" meters";
    }

    public String batteryDisplay() {
        if(battery<=0) return "Battery empty";
        return "Battery at " + battery + "%";
    }

    public void drive() {
        if(battery>0) {
            drive+=20;
            battery-=1;
        }
        return;
    }
}
