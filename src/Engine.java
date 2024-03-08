public class Engine {

    private FuelType engineType;
    private int consumption; // in kilometers per unit. Ex: Km/Lt
    private int mileage;

    public Engine(FuelType engineType, int consumption) {
        this.engineType = engineType;
        this.consumption = consumption;
    }

    public int getFuelConsumption() {
        return this.consumption;
    }

    public FuelType getEngineType(){
        return this.engineType;
    }

    public int getMileage(){
        return this.mileage;
    }

    public int requiredFuel(int distance) {
        return distance / consumption;
    }

    public void travel(int distance) {
        mileage += distance;
    }

    @Override
    public String toString() {
        return "Engine [consumption=" + consumption + ", mileage=" + mileage + ", engineType=" + engineType + "]";
    }
}