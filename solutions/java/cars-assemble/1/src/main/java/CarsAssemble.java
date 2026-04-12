public class CarsAssemble {
    private static final int NOS=221;
    public double productionRatePerHour(int speed) {
        double sc;
        if(speed>=1 && speed<=4) sc=1;
        else if(speed>=5 && speed<=8) sc=0.9;
        else if(speed==9) sc=0.8;
        else if(speed==10) sc=0.77;
        else sc=0.0;
        return speed*NOS*sc;
    }

    public int workingItemsPerMinute(int speed) {
        double items=productionRatePerHour(speed);
        double answer=items/60;
        return (int)answer;
    }
}
