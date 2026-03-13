public class Lasagna {
    int layers;
    int actualMinutes;
    int expectedMinutes = 40;
    int totalMinutes;
    int minsPerLayer = 2;
    
    public int expectedMinutesInOven(){
        return expectedMinutes;
    }

    public int remainingMinutesInOven(int actualMinutes){
        return expectedMinutes - actualMinutes;
    }

    public int preparationTimeInMinutes(int layers){
        return layers*minsPerLayer;
    }

    public int totalTimeInMinutes(int layers, int actualMinutes){
        return preparationTimeInMinutes(layers) + actualMinutes;
  }
}
