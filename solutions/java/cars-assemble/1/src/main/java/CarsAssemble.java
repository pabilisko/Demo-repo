public class CarsAssemble {
    int speed;
    int producedPerHour = 221;

    public double productionRatePerHour(int speed) {
        this.speed = speed;
        return producedPerHour * speed*successRate(speed);
    };

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
    private double successRate(int speed) {
        if (speed >= 1 && speed <= 4) 
            return 1.0;
        if (speed >= 5 && speed <= 8) 
            return 0.9;
        if (speed == 9)              
            return 0.8;
        if (speed == 10)              
            return 0.77;
        else 
            return 0.0;
    }
}
