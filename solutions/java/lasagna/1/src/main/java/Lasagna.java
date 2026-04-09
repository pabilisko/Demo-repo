public class Lasagna {
    int layers;
    int actualMinutes;
    int expectedMinutes = 40;
    int totalMinutes;
    int minsPerLayer = 2;
    
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return expectedMinutes;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualMinutes){
        
        return expectedMinutes - actualMinutes;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        return layers*minsPerLayer;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int actualMinutes){
        return preparationTimeInMinutes(layers) + actualMinutes;
  }
}
