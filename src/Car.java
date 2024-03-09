public class Car {

    private String category;
    private Engine engine;
    private FuelCapacity fuelCapacity;

    public Car(String category, FuelType fuelType, int engineConsumption, int capacity) {
        this.category = category;
        engine = new Engine(fuelType, engineConsumption);
        fuelCapacity = new FuelCapacity(fuelType, capacity);
    }

    public String getCategory() {
        return category;
    }

    public int getAvailableFuel() {
        return fuelCapacity.getAvailableFuel();
    }

    // Returns the actual amount fueled
    public int refuel(FuelType fuelType, int amount) {
        int freeCapacity = fuelCapacity.getCapacity() - fuelCapacity.getAvailableFuel();
        if (freeCapacity < amount) {
            fuelCapacity.supply(fuelType, freeCapacity);
            return freeCapacity;
        } else {
            fuelCapacity.supply(fuelType, amount);
            return amount;
        }
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
        return "Car:\n  Model=" + category + "\n  Engine=" + engine + "\n  Tank=" + fuelCapacity;
    }
}