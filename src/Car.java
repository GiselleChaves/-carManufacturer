public class Car {

    private CarCategory category;
    private Engine engine;
    private FuelCapacity fuelCapacity;

    private Car(Builder builder) {
        this.category = builder.category;
        engine = builder.engine;
        fuelCapacity = builder.fuelCapacity;
    }

    public String getCategory() {
        return category.name();
    }

    public int getAvailableFuel() {
        return fuelCapacity.getAvailableFuel();
    }

    // Returns the actual amount fueled
    public int refuel(FuelType fuelType, int amount) {
        int maxRefuelAmount;
        if(fuelType == FuelType.ALCOOL){
            maxRefuelAmount = Math.min(amount, 6 - fuelCapacity.getAvailableFuel());
        } else {
            maxRefuelAmount = Math.min(amount, 8 - fuelCapacity.getAvailableFuel());
        }
            fuelCapacity.supply(fuelType, maxRefuelAmount);
            return maxRefuelAmount;
    }
    
    // Returns the distance it can travel with the remaining fuel
    public int checkIfCanTravel(int distance) {
        int fuelRequired = engine.requiredFuel(distance);
        if (fuelCapacity.getAvailableFuel() >= fuelRequired) {
            return distance;
        } else {
            return fuelCapacity.getAvailableFuel() * engine.getFuelConsumption();
        }
    }

    // Returns true if managed to travel
    public boolean travel(int distance) {
        if (checkIfCanTravel(distance) >= distance) {
            engine.travel(distance);
            fuelCapacity.expend(engine.requiredFuel(distance));
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Car:\n  Model=" + category.name() + "\n  Engine=" + engine + "\n  Tank=" + fuelCapacity;
    }

    public static class Builder {
        private CarCategory category;
        private Engine engine;
        private FuelCapacity fuelCapacity;

        public Builder(CarCategory category, Engine engine, FuelCapacity fuelCapacity) {
            this.category = category;
            this.engine = engine;
            this.fuelCapacity = fuelCapacity;
        }

        public Car build() {
            return new Car(this);
        }
    }
}